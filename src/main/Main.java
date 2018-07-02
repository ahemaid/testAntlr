package main;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import core.CollectionErrorListener;
import core.ShortToUnicodeString;
import core.TurtleLexer;
import core.TurtleParser;
import errorCorrection.Correction;
import errorDetection.DescriptiveErrorListener;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
public class Main {

	// needed for large files 
	static DescriptiveErrorListener errorListener = new DescriptiveErrorListener();
	static ArrayList<String> errorCorrectionsReport = new ArrayList<String>();

	public static void main (String[] args) {
		//final String filename ="/home/ahmed/Downloads/rdfDoctorTest/xaa_with_errors";
		//final String filename = "/home/ahmed/Downloads/albumin-epo.ttl";
		//final String filename = "/home/ahmed/Downloads/persondata_en.ttl";
		//final String filename = "/home/ahmed/Desktop/eclipse-projects/RDF-Doctor/Resources/myTest/test.ttl";
		//final String filename = "/home/ahmed/Downloads/persondata_en _with_errors.ttl";
		//final String filename ="/home/ahmed/Downloads/rdfDoctorTest/file_size_385mb_with_3_errors.ttl";
		final String filename = "/home/ahmed/Desktop/eclipse-projects/RDF-Doctor/Resources/myTest/test.ttl" ; 
		final String outputFilename = "/home/ahmed/Downloads/xaa.output" ;
		final String errorFilename = "/home/ahmed/Downloads/xaa.error" ;

		// test with all TurtleSuit files 	
		//		String turtleFolderPath = "/home/ahmed/Desktop/eclipse-projects/RDF-Doctor/Resources/TurtleTests/";
		//		File dir = new File(turtleFolderPath);
		//		String[] extensions = new String[] { "ttl" };
		//		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		//		for (File file : files) {

		long startTime = 0, endTime = 0;
		StringBuilder inputSB = new StringBuilder();
		//PrintStream printStream ;
		//final String filename = "data.ttl";
		//System.out.print("\n\n\nlocationListener"+locationListener.getLineNo());
		//parser.setParseLocationListener(locationListener);
		//parser.setParseLocationListener(el)
		InputStream input;
		//			ANTLRErrorListener listener = new BaseErrorListener();
		//			CollectionErrorListener collector = new CollectionErrorListener();




		try {

			// new input stream created
			// test with all TurtleSuit files 
			//input = new FileInputStream(file.getCanonicalFile());

			// needed for large file
			input = new FileInputStream(filename);
			//PrintStream printStream = new PrintStream(new FileOutputStream(outputFilename));
			//System.setOut(printStream);

			// start time counter
			startTime = System.nanoTime();
			// clear output file at the start of the program
			FileWriter fw =new FileWriter(outputFilename, false);
			fw.write("");
			fw.close();


			BufferedReader reader = new BufferedReader(new InputStreamReader(input,"UTF8"));
			//				Correction corrector = new Correction();

			// needed for reading multiple files 
			// send system.out to a file
			//DescriptiveErrorListener errorListener = new DescriptiveErrorListener();
			//System.out.print("\n"+file.getCanonicalFile());


			String line;
			int counter = 1;
			//ArrayList<String> currentData = new ArrayList(); 
			String [] currentData = new String[1000000];
			Arrays.fill( currentData, "" );


			// SETUP
			System.out.print("Processing is going on ");
			Runnable notifier = new Runnable() {
				public void run() {
					System.out.print("!");
				}
			};

			ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

			// IN YOUR WORK THREAD
			scheduler.scheduleAtFixedRate(notifier, 1, 1, TimeUnit.SECONDS);

			while ((line = reader.readLine()) != null) {
				currentData[counter - 1]=line+"\n";
				counter++;
				if (counter%999999 == 0) {
					break;
				}
			}

			//for smaller than 1000000 lines
			errorListener.setInput(currentData);
			parse( currentData ,outputFilename);
			Arrays.fill( currentData, "" );


			//Middle part of multiple 999999 lines 
			int higherCounter = 0;
			boolean dataBelowMilion = true;
			//for greater that 1000000 lines
			while ((line = reader.readLine()) != null) {
				currentData[higherCounter]=line+"\n";
				counter++;
				higherCounter++;
				dataBelowMilion = true;

				if (counter%999999 == 0 ) {
					//System.out.print("\nLine"+line);
					errorListener.setInput(currentData);
					errorListener.setOffest(counter -1);
					parse(currentData,outputFilename);
					Arrays.fill( currentData, "" );
					higherCounter = 0;
					dataBelowMilion = false;
				} 
			}
			if(dataBelowMilion && counter > 999999) {
				errorListener.setInput(currentData);
				errorListener.setOffest(counter -1);
				parse(currentData,outputFilename);
				Arrays.fill( currentData, "" );
			}

			scheduler.shutdownNow();
			// write error list to an error file 
			writeErrorsToFile(errorFilename);
			// show corrections list report if there any in the corrections list
			if(!errorCorrectionsReport.isEmpty())
				showCorrectionReport();

			endTime = System.nanoTime();


			//show AST in GUI
			/*
			        JFrame frame = new JFrame("Antlr AST");

			        TreeViewer viewr = new TreeViewer(Arrays.asList(
			                parser.getRuleNames()),tree);
			        viewr.setScale(1.5);//scale a little
			        JScrollPane panel = new JScrollPane(viewr);
			        //panel.setAutoscrolls(true);
			        panel.setAutoscrolls(true);
			        frame.add(panel);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.setSize(1200,800);
			        frame.setVisible(true);

			 */
			// show detected errors
			/*
				 for (SyntaxError e : collector.getErrors()) {
		            // RecognitionExceptionUtil is my custom class discussed next.
//		        	try {
//		        	      //create a buffered reader that connects to the console, we use it so we can read lines
//		        	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//		        	      //read a line from the console
//		        	      String lineFromInput = in.readLine();
//
//		        	      //create an print writer for writing to a file
//		        	      PrintWriter out = new PrintWriter(new File(filename+"out"));
//
//		        	      //output to the file a line
//		        	      out.println(lineFromInput);
//
//		        	      //close the file (VERY IMPORTANT!)
//		        	      out.close();
//		        	   }
//		        	      catch(IOException e1) {
//		        	        System.out.println("Error during reading/writing");
//		        	   }
		            System.out.println("\n"+RecognitionExceptionUtil.formatVerbose(e));
		           // FileUtils.writeStringToFile(new File(filename+"out"), "data", "UTF-8");
		            //(filename+"", "\n"+RecognitionExceptionUtil.formatVerbose(e));
		            //.writeStringToFile(new File("test.txt"), "Hello File");

		        }

			 */

			long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
			System.out.println("\n\nTotal elapsed time: " + elapsedTimeInMillis + " ms");
			System.out.println("\nNumber of processed lines:"+ counter);
			System.gc();//gc, won't run for such tiny object so forced clean-up



		}catch(RecognitionException e ) {
			System.out.print("\n\n\n from inside catch "+e.getMessage());
		}catch(IOException ioe) {
			System.out.print("\n"+ioe.getMessage());
		}

		// end of test with all TurtleSuit files 
		//}

	}

	static void parse(String [] inputChunck, String outFilename) {

		ANTLRErrorListener listener = new BaseErrorListener();
		CollectionErrorListener collector = new CollectionErrorListener();
		Correction corrector = new Correction();
		// create a CharStream that reads from standard input
		// ANTLRInputStream input = new ANTLRInputStream(txt);
		// create a lexer that feeds off of input CharStream
		//System.out.print(inputChunck);
		TurtleLexer lexer = new  TurtleLexer(new ANTLRInputStream(String.join("",inputChunck)));
		//lexer.addErrorListener(collector);
		lexer.removeErrorListeners();
		lexer.addErrorListener(errorListener);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer

		TurtleParser parser = new TurtleParser(tokens);
		//parser.removeErrorListeners();
		//parser.addErrorListener(collector);
		//parser.addErrorListener(listener);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListener);
		ParseTree tree = parser.start(); // begin parsing at init rule
		//System.out.print("\n\n"+parser.getCurrentToken());
		//System.out.print("\n\n"+tree.getText());
		//ParseTree tree = parser.init(); // begin parsing at init rule


		//System.out.println("tree"+tree.toStringTree()); // print LISP-style tree

		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks
		//walker.walk((ParseTreeListener) listener, tree);

		//show AST in GUI
		JFrame frame = new JFrame("Parsing Tree");

		TreeViewer viewr = new TreeViewer(Arrays.asList(
				parser.getRuleNames()),tree);
		viewr.setScale(1.5);//scale a little
		JScrollPane panel = new JScrollPane(viewr);
		//panel.setAutoscrolls(true);
		panel.setAutoscrolls(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,800);
		frame.setVisible(true);



		//		startRule_ctx root = ... ;
		//		ParseTreeVisitor visitor = new ParseTreeVisitor();
		//		visitor.visit(listener, root);

		//System.out.println(); // print a \n after translation
		corrector.process(inputChunck,errorListener.errorsList );

		//show arrayOfErrors
		//System.out.print(errorListener.errorsList);

		corrector.showInputAfterEditing();
		corrector.writeToFileAfterEditing(outFilename);
		if(!corrector.errorCorrectionsList.isEmpty()) {
			for(String line : corrector.errorCorrectionsList) {
				errorCorrectionsReport.add(line);

			}
		}
		//errorListener.resetErrorList();

	}

	// write the errors to a file 
	static public void writeErrorsToFile (String errorFilename) {
		long count = 1;
		String data = "";
		JSONArray errorJSONArray = new JSONArray();

		File file = new File(errorFilename);
		FileWriter fr = null;
		try {

			fr = new FileWriter(file);
			for(String line : errorListener.errorsList) {
				// check if input is empty
				if(line == "") {
					break;
				}
				// create a JSONObject to hold the error number and the message
				JSONObject errorJSONObject = new JSONObject();
				errorJSONObject.put("Error Message", line);
				errorJSONObject.put("Error Number", count++);
				errorJSONArray.put(errorJSONObject);
				// can be used to show error with a plain text
				//fr.write("\nError"+count++ +": "+line);

			}


		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//System.out.print("\nOutput file is saved !");
			//close resources

			try {
				fr.write(errorJSONArray.toString());
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// display report about the corrections list
	static public void showCorrectionReport () {
		// counter for number of corrections
		int count = 1;
		// check if there are some corrections done
		if(!errorCorrectionsReport.isEmpty()) {
			System.out.println(":::::::::::::::::::::::");
			System.out.println(":: Correction Reprot ::");
			System.out.println(":::::::::::::::::::::::");
			for(String line : errorCorrectionsReport) {
				System.out.println("Correction "+ count++ +": " + line);
			}
		}
	}

}
