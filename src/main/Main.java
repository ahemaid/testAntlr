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

import core.CollectionErrorListener;
import core.ShortToUnicodeString;
import core.TurtleLexer;
import core.TurtleParser;
import errorCorrection.Correction;
import errorDetection.DescriptiveErrorListener;

import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.FileOutputStream;

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

	static DescriptiveErrorListener errorListener = new DescriptiveErrorListener();

	public static void main (String[] args) {
		//final String filename = "/home/ahmed/Downloads/yagoRedirectLabels_de.ttl";
		//final String filename = "b2.ttl";
		//final String filename = "/home/ahmed/Downloads/TESTS/TurtleTestsResult/bad_syntax/turtle-syntax-bad-n3-extras-05.ttl";
		//final String filename = "mainfest.ttl";
		//final String filename = "test.ttl";
		//final String filename = "testTurtle.ttl";
		//final String filename = "/home/ahmed/Downloads/xaa";
		//final String filename = "/home/ahmed/Downloads/mappingbased_properties_en_uris_fr.ttl";
		final String filename = "/home/ahmed/Desktop/eclipse-projects/RDF-Doctor/Resources/TurtleTestsResult/bad_syntax/turtle-syntax-bad-n3-extras-09.ttl";
		final String outputFilename = "/home/ahmed/Downloads/xaa_Output.ttl" ;


		// test with all TurtleSuit files 
		/*
		String turtleFolderPath = "/home/ahmed/Downloads/TESTS/TurtleTests/";
		File dir = new File(turtleFolderPath);
		String[] extensions = new String[] { "ttl" };
		List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
		for (File file : files) {
		 */



		long startTime = 0, endTime = 0;
		StringBuilder inputSB = new StringBuilder();
		//final String filename = "data.ttl";
		//System.out.print("\n\n\nlocationListener"+locationListener.getLineNo());
		//parser.setParseLocationListener(locationListener);
		//parser.setParseLocationListener(el)
		InputStream input;
		//			ANTLRErrorListener listener = new BaseErrorListener();
		//			CollectionErrorListener collector = new CollectionErrorListener();




		try {

			// new input stream created
			//System.out.print("\n"+file.getCanonicalFile());

			// test with all TurtleSuit files 
			//input = new FileInputStream(file.getCanonicalFile());

			input = new FileInputStream(filename);

			BufferedReader reader = new BufferedReader(new InputStreamReader(input,"UTF8"));
			//				DescriptiveErrorListener errorListener = new DescriptiveErrorListener();
			//				Correction corrector = new Correction();


			// send system.out to a file
			//PrintStream printStream = new PrintStream(new FileOutputStream(file.getCanonicalFile()+".out"));
			//System.setOut(printStream);
			startTime = System.nanoTime();

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
				System.out.print("line "+counter+"  "+line+"\n");
				currentData[counter - 1]=line+"\n";
				counter++;
				if (counter%99 == 0) {
					break;
				}
			}

			//for smaller than 1000000 lines
			//System.out.print(String.join("",currentData));
			
			errorListener.setInput(currentData);
			parse( currentData ,outputFilename);
			//currentData = new String[1000010];
			Arrays.fill( currentData, "" );

			//inputSB.replace(0, inputSB.length() -1, "");
			//currentData = {};
			//System.gc();//gc, won't run for such tiny object so forced clean-up
			//errorListener.setOffest(counter);

			//Midddle part of with double of 999999 lines 

			int higherCounter = 0;
			//for greater that 1000000 lines
//			while ((line = reader.readLine()) != null) {
//				//System.out.print("line "+counter+"  "+line+"\n");
//				currentData[higherCounter]=line+"\n";
//				counter++;
//				higherCounter++;
//
//				if (counter%999999 == 0 ) {
//					//System.out.print("\nLine"+line);
//					errorListener.setInput(currentData);
//					errorListener.setOffest(counter);
//					parse(currentData,outputFilename);
//					Arrays.fill( currentData, "" );
//					//System.gc();//gc, won't run for such tiny object so forced clean-up
//					higherCounter =0;
//				}
//			}
//			if(counter > 999999)
//			//last part less thatn 999999 lines 
//			higherCounter = 0;
//			while ((line = reader.readLine()) != null) {
//
//				//System.out.print("line "+counter+"  "+line+"\n");
//				currentData[higherCounter]=line+"\n";
//				counter++;
//				higherCounter++;
//
//			}
//			//System.out.print("\nLine"+line);
//			errorListener.setInput(currentData);
//			errorListener.setOffest(counter);
//			parse(currentData,outputFilename);
//			Arrays.fill( currentData, "" );
//			//System.gc();//gc, won't run for such tiny object so forced clean-up
//			//errorListener.setOffest(counter);


			scheduler.shutdownNow();

			int lineCount = 1;
			for (String errorMessage : errorListener.errorsList){
				System.out.print("\nerror "+ lineCount++ +": "+errorMessage);

			}

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


			//		        for(String l : RecognitionExceptionUtil.lines)
			//	            System.out.println("\n"+l);

			//System.out.print("\n"+listener.);
			// Create a generic parse tree walker that can trigger callbacks
			//ParseTreeWalker walker = new ParseTreeWalker();
			//System.out.println("\n"); // print LISP-style tree

			// Walk the tree created during the parse, trigger callbacks
			//    walker.walk(new ShortToUnicodeString(), tree);
			//    System.out.println("\n"+tree.toStringTree(parser)); // print LISP-style tree
			System.out.println("\n\n");

			long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
			System.out.println("\n\nTotal elapsed time: " + elapsedTimeInMillis + " ms");
			System.out.println("\nNumber of processed lines:"+ counter);

			//printStream.close();
			System.gc();//gc, won't run for such tiny object so forced clean-up


		}catch(RecognitionException e ) {
			System.out.print("\n\n\n from inside catch "+e.getMessage());
		}catch(IOException ioe) {
			//System.out.print("\n lfsd;lkfjsdl;fj;lskdjfl;kdsfj "+ioe.getMessage());

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
		//walker.walk(listener, tree);


		//show AST in GUI

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



		//		startRule_ctx root = ... ;
		//		ParseTreeVisitor visitor = new ParseTreeVisitor();
		//		visitor.visit(listener, root);

		//System.out.println(); // print a \n after translation
		//corrector.process(inputChunck,errorListener.errorsList );

		//show arrayOfErrors
		System.out.print(errorListener.errorsList);

		//corrector.showInputAfterEditing();
		//corrector.writeToFileAfterEditing(outFilename);

	}

}
