package errorDetection;

import org.antlr.v4.runtime.*;
import java.util.ArrayList;

public class DescriptiveErrorListener extends BaseErrorListener {
   // public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();
    public 	ArrayList<String> errorsList = new ArrayList<String>();
    private int offest = 0;
    private static String [] inputLines;
    public void DescriptiveErrorListener() {
    	//errorsList.removeAll(errorsList);
    }

     @Override
     public void finalize() {
      //	errorsList.removeAll(errorsList);
     }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
//        if (!REPORT_SYNTAX_ERRORS) {
//            return;
//        }

        //String sourceName = recognizer.getInputStream().getSourceName();
//        if (!sourceName.isEmpty()) {
//            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
//        }
    	int currentLine = line + offest; 
    	errorsList.add("line "+ currentLine +":"+charPositionInLine+" "+msg +getErrorLineStringUnderlined(line,charPositionInLine) );
        //System.err.println();
    }
    public void setOffest(int count) {
    	offest = count;
    }
    
    public void setInput(String [] arr) {
    	inputLines = arr;
    }
    public static String getErrorLineString(int lineNumber) {
//        if (e == null || e.getRecognizer() == null
//                || e.getRecognizer().getInputStream() == null
//                || e.getOffendingToken() == null) {
//            return "";
//        }
//        CommonTokenStream tokens =
//            (CommonTokenStream)e.getRecognizer().getInputStream();
//        String input = tokens.getTokenSource().getInputStream().toString();
 //       String [] linesBeforeEditing = input.split(String.format("\r?\n"));
//        if(e.getMessage().contains("Missing '.' at the end of directive")) {
//        	if(e.getOffendingToken().getCharPositionInLine() == 0)
//        		linesBeforeEditing[e.getOffendingToken().getLine() - 2] = linesBeforeEditing[e.getOffendingToken().getLine() - 2].substring(0, linesBeforeEditing[e.getOffendingToken().getLine() - 2].length()) + ".";
//        // write back after fixing error 
//        lines = linesBeforeEditing;
//        }

        return inputLines[lineNumber - 1];
    }
//
//    
    public static String getErrorLineStringUnderlined(int lineNumber ,int colNumber) {
        String errorLine = getErrorLineString(lineNumber);
        if (errorLine.isEmpty()) {
            return errorLine;
        }
        // replace tabs with single space so that charPositionInLine gives us the
        // column to start underlining.
        errorLine = errorLine.replaceAll("\t", " ");
        StringBuilder underLine = new StringBuilder(String.format("%" + errorLine.length() + "s", ""));
//        int start = e.getOffendingToken().getStartIndex();
//        int stop = e.getOffendingToken().getStopIndex();
//        if ( start>=0 && stop>=0 ) {
//            for (int i=0; i<=(stop-start); i++) {
//                underLine.setCharAt(e.getOffendingToken().getCharPositionInLine() + i, '^');
//            }
//        }
//        return String.format("%s%n%s", errorLine, underLine);
        underLine.setCharAt(colNumber, '^');
//        return String.format("%s%n", errorLine);
      return String.format("%s%n%s","\n"+ errorLine, underLine);


    }
}
