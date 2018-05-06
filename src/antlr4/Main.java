package antlr4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
public class Main {
	
	

	
	private static void printDrink(String Text) {
	    // Get our lexer
		String text = 
		"@base <http://example.org/> .\n" + 
		"PREFIX77 mv: <http://eccenca.com/mobivoc/> \n" + 
		"PREFIX tuu: <http://www.w3.org/2002/07/owl#> \n" + 
		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n" + 
		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> \n" + 
		"PREFIX  skos: \n" + 
		"@prefix  skosh: <> .\n" + 
		"@prefix  skosh7: <http://www.w3.org/2000/01/rdf-schema#> .\n" ;
		

//
////		"rdf:ff rdfs:lable \"ddddd\" . ";
//	    HelloLexer lexer = new  HelloLexer(new ANTLRInputStream(Text));
//	 
//	    // Get a list of matched tokens
//	    CommonTokenStream tokens = new CommonTokenStream(lexer);
//	 
//	    // Pass the tokens to the parser
//	    HelloParser parser = new  HelloParser(tokens);
//	 
//	    // Specify our entry point
//	    HelloParser.TurtleDocContext sentenceContext = parser.turtleDoc();
//
//	    // Walk it and attach our listener
//	    ParseTreeWalker walker = new ParseTreeWalker();
//	    walker.walk(listener, sentenceContext);
	}

	public static void main (String[] args) {
		//final String filename = "/home/ahmed/Downloads/yagoRedirectLabels_de.ttl";
		//final String filename = "b2.ttl";
		//final String filename = "/home/ahmed/Downloads/TESTS/TurtleTests/turtle-syntax-bad-base-02.ttl";
		//final String filename = "mainfest.ttl";
		//final String filename = "test.ttl";
		//final String filename = "Battery.ttl";
		//final String filename = "testTurtle.ttl";
		final String filename = "/home/ahmed/Downloads/TESTS/TurtleTests/turtle-syntax-bad-esc-01.ttl";
		long startTime = 0, endTime = 0;
		StringBuilder inputSB = new StringBuilder();
		//final String filename = "data.ttl";
		//System.out.print("\n\n\nlocationListener"+locationListener.getLineNo());
		//parser.setParseLocationListener(locationListener);
		//parser.setParseLocationListener(el)
		InputStream input;
		ANTLRErrorListener listener = new BaseErrorListener();
	    CollectionErrorListener collector = new CollectionErrorListener();

		try {

			// new input stream created
			input = new FileInputStream(filename);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			 startTime = System.nanoTime();

			String line;
			int counter = 1;
			ArrayList<String> subArray = new ArrayList(); 

			while ((line = reader.readLine()) != null) {

				System.out.print("line "+counter+"  "+line+"\n");
				counter++;
				inputSB.append(line+"\n");
				if (counter == 10000000)
					break;
			}

		       // create a CharStream that reads from standard input
		       // ANTLRInputStream input = new ANTLRInputStream(txt);
		        // create a lexer that feeds off of input CharStream
			    TurtleLexer lexer = new  TurtleLexer(new ANTLRInputStream(inputSB.toString()));
		        // create a buffer of tokens pulled from the lexer
		        CommonTokenStream tokens = new CommonTokenStream(lexer);
		        // create a parser that feeds off the tokens buffer

		        TurtleParser parser = new TurtleParser(tokens);
		        parser.addErrorListener(collector);
		        //parser.addErrorListener(listener);
		        ParseTree tree = parser.start(); // begin parsing at init rule
		        //System.out.print("\n\n"+parser.getCurrentToken());
		        //System.out.print("\n\n"+tree.getText());
		        //ParseTree tree = parser.init(); // begin parsing at init rule
		        System.out.println("tree"+tree.toStringTree()); // print LISP-style tree
		     // Create a generic parse tree walker that can trigger callbacks
		        ParseTreeWalker walker = new ParseTreeWalker();
		        // Walk the tree created during the parse, trigger callbacks
		        walker.walk(new ShortToUnicodeString(), tree);
		        System.out.println(); // print a \n after translation
		        
				 endTime = System.nanoTime();

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
		        for (SyntaxError e : collector.getErrors()) {
		            // RecognitionExceptionUtil is my custom class discussed next.
		            System.out.println("\n"+RecognitionExceptionUtil.formatVerbose(e));
		        }
//		        for(String l : RecognitionExceptionUtil.lines)
//	            System.out.println("\n"+l);

				//System.out.print("\n"+listener.);

		}catch(RecognitionException e ) {
			System.out.print("\n\n\n from inside catch "+e.getMessage());
		}catch(IOException ioe) {
			//System.out.print("\n lfsd;lkfjsdl;fj;lskdjfl;kdsfj "+ioe.getMessage());

		}
		
		
		

 

        // Create a generic parse tree walker that can trigger callbacks
        //ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println("\n"); // print LISP-style tree

        // Walk the tree created during the parse, trigger callbacks
	    //    walker.walk(new ShortToUnicodeString(), tree);
	    //    System.out.println("\n"+tree.toStringTree(parser)); // print LISP-style tree
		long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("\n\nTotal elapsed time: " + elapsedTimeInMillis + " ms");
		

	}
	
}
