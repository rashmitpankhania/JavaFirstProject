//package org.example.NaturalLanguage;
//
//import org.antlr.v4.runtime.*;
//
//import java.util.Calendar;
//import java.util.Date;
//
//public class DateParser {
//
//  public static Date parseDate(String dateString) throws RecognitionException {
//    CharStream charStream = CharStreams.fromString(dateString);
//    DateParser_enLexer lexer = new DateParser_enLexer(charStream);
//    TokenStream tokenStream = new CommonTokenStream(lexer);
//    ErrorReportingDateParser parser = new ErrorReportingDateParser(tokenStream);
//    Date date = parser.date_string();
//    if (parser.exception != null) {
//      throw parser.exception;
//    }
//    return date;
//  }
//
//  public static Date safeParseDate(String dateString) {
//    Date date;
//    try {
//      date = parseDate(dateString);
//    } catch (RecognitionException e) {
//      date = Calendar.getInstance().getTime();
//    }
//    return date;
//  }
//
//  static class ErrorReportingDateParser extends DateParser_enParser {
//
//    public RecognitionException exception;
//
//    public ErrorReportingDateParser(TokenStream input) {
//      super(input);
//    }
//
//    public ErrorReportingDateParser(TokenStream input, RecognizerSharedState state) {
//      super(input, state);
//    }
//
//    @Override
//    public void reportError(RecognitionException e) {
//      exception = e;
//    }
//
//  }
//}