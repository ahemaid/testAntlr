package errorDetection;

import org.antlr.v4.runtime.*;
import java.util.ArrayList;

public class DescriptiveErrorListener extends BaseErrorListener {
   // public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();
    public 	ArrayList<String> errorsList = new ArrayList<String>();

    public void DescriptiveErrorListener() {
    	errorsList.removeAll(errorsList);
    }

     @Override
     public void finalize() {
      	errorsList.removeAll(errorsList);
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
    	errorsList.add("line "+line+":"+charPositionInLine+" "+msg);
        //System.err.println();
    }
}
