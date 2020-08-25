//// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g 2012-06-16 11:05:21
//
//package org.example.NaturalLanguage;
//
//import java.util.Calendar;
//
//import org.antlr.v4.runtime.NoViableAltException;
//import org.antlr.v4.runtime.Parser;
//import org.antlr.v4.runtime.RecognitionException;
//import org.antlr.v4.runtime.TokenStream;
//import org.antlr.v4.runtime.atn.ATN;
//
//import java.util.Stack;
//import java.util.List;
//import java.util.ArrayList;
//
//public class DateParser_enParser extends Parser {
//  public static final String[] tokenNames = new String[] {
//          "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "COMMA", "A", "NUMBER_LITERAL", "Y", "E", "S", "T", "R", "D", "O", "M", "W", "K", "N", "H", "U", "F", "I", "V", "X", "G", "L", "B", "NEWLINE", "WS", "C", "J", "P", "Q", "Z"
//  };
//  public static final int D=14;
//  public static final int E=10;
//  public static final int F=22;
//  public static final int G=26;
//  public static final int A=7;
//  public static final int B=28;
//  public static final int C=31;
//  public static final int L=27;
//  public static final int M=16;
//  public static final int N=19;
//  public static final int O=15;
//  public static final int H=20;
//  public static final int I=23;
//  public static final int J=32;
//  public static final int K=18;
//  public static final int U=21;
//  public static final int T=12;
//  public static final int W=17;
//  public static final int V=24;
//  public static final int Q=34;
//  public static final int P=33;
//  public static final int S=11;
//  public static final int MINUS=5;
//  public static final int R=13;
//  public static final int EOF=-1;
//  public static final int Y=9;
//  public static final int X=25;
//  public static final int Z=35;
//  public static final int WS=30;
//  public static final int NEWLINE=29;
//  public static final int COMMA=6;
//  public static final int PLUS=4;
//  public static final int NUMBER_LITERAL=8;
//
//  // delegates
//  // delegators
//
//
//  public DateParser_enParser(TokenStream input) {
//    this(input, new RecognizerSharedState());
//  }
//  public DateParser_enParser(TokenStream input, RecognizerSharedState state) {
//    super(input, state);
//
//  }
//
//
//  public String[] getTokenNames() { return DateParser_enParser.tokenNames; }
//
//  @Override
//  public String[] getRuleNames() {
//    return new String[0];
//  }
//
//  public String getGrammarFileName() { return "C:\\Users\\Ethan\\workspaces\\Java\\DateParser-github\\src\\com/eblackwelder/date\\DateParser_en.g"; }
//
//  @Override
//  public ATN getATN() {
//    return null;
//  }
//
//
//  private final DateMethod delegate = new DateMethod();
//
//
//
//  // $ANTLR start "date_string"
//  public final java.util.Date date_string() throws RecognitionException {
//    java.util.Date date = null;
//
//    try {
//      {
//        int alt2=3;
//        switch ( input.LA(1) ) {
//          case EOF:
//          {
//            alt2=1;
//          }
//          break;
//          case A:
//          case NUMBER_LITERAL:
//          case Y:
//          case E:
//          case S:
//          case T:
//          case O:
//          case M:
//          case W:
//          case N:
//          case F:
//          case L:
//          {
//            alt2=2;
//          }
//          break;
//          case PLUS:
//          case MINUS:
//          {
//            alt2=3;
//          }
//          break;
//          default:
//            NoViableAltException nvae =
//                    new NoViableAltException("", 2, 0, input);
//
//            throw nvae;
//        }
//
//        switch (alt2) {
//          case 1 :
//          {
//            match(input,EOF,FOLLOW_EOF_in_date_string80);
//
//          }
//          break;
//          case 2 :
//          {
//            pushFollow(FOLLOW_date_expression_in_date_string86);
//            date_expression();
//
//            state._fsp--;
//
//            int alt1=2;
//            int LA1_0 = input.LA(1);
//
//            if ( ((LA1_0>=PLUS && LA1_0<=MINUS)) ) {
//              alt1=1;
//            }
//            switch (alt1) {
//              case 1 :
//              {
//                pushFollow(FOLLOW_date_modifier_in_date_string88);
//                date_modifier();
//
//                state._fsp--;
//
//
//              }
//              break;
//
//            }
//
//
//          }
//          break;
//          case 3 :
//          {
//            pushFollow(FOLLOW_date_modifier_in_date_string95);
//            date_modifier();
//
//            state._fsp--;
//
//
//          }
//          break;
//
//        }
//
//        date = delegate.getDate();
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return date;
//  }
//  // $ANTLR end "date_string"
//
//
//  // $ANTLR start "binary_operator"
//  public final int binary_operator() throws RecognitionException {
//    int direction = 0;
//
//    try {
//      int alt3=2;
//      int LA3_0 = input.LA(1);
//
//      if ( (LA3_0==PLUS) ) {
//        alt3=1;
//      }
//      else if ( (LA3_0==MINUS) ) {
//        alt3=2;
//      }
//      else {
//        NoViableAltException nvae =
//                new NoViableAltException("", 3, 0, input);
//
//        throw nvae;
//      }
//      switch (alt3) {
//        case 1 :
//        {
//          match(input,PLUS,FOLLOW_PLUS_in_binary_operator114);
//          direction = 1;
//
//        }
//        break;
//        case 2 :
//        {
//          match(input,MINUS,FOLLOW_MINUS_in_binary_operator121);
//          direction = -1;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return direction;
//  }
//  // $ANTLR end "binary_operator"
//
//
//  // $ANTLR start "date_modifier"
//  public final void date_modifier() throws RecognitionException {
//    int unitsOfTime1 = 0;
//
//    int binary_operator2 = 0;
//
//    int numberExpression3 = 0;
//
//
//    try {
//      {
//        pushFollow(FOLLOW_binary_operator_in_date_modifier132);
//        binary_operator2=binary_operator();
//
//        state._fsp--;
//
//        pushFollow(FOLLOW_numberExpression_in_date_modifier134);
//        numberExpression3=numberExpression();
//
//        state._fsp--;
//
//        pushFollow(FOLLOW_unitsOfTime_in_date_modifier136);
//        unitsOfTime1=unitsOfTime();
//
//        state._fsp--;
//
//        delegate.add(unitsOfTime1, binary_operator2 * numberExpression3);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "date_modifier"
//
//
//  // $ANTLR start "date_expression"
//  public final void date_expression() throws RecognitionException {
//    int unitsOfTime4 = 0;
//
//    int numberExpression5 = 0;
//
//    int beforeOrAfter6 = 0;
//
//
//    try {
//      int alt5=4;
//      alt5 = dfa5.predict(input);
//      switch (alt5) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_date_literal_in_date_expression147);
//          date_literal();
//
//          state._fsp--;
//
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_nextOrLastExpression_in_date_expression152);
//          nextOrLastExpression();
//
//          state._fsp--;
//
//
//        }
//        break;
//        case 3 :
//        {
//          pushFollow(FOLLOW_weekdayExpression_in_date_expression157);
//          weekdayExpression();
//
//          state._fsp--;
//
//
//        }
//        break;
//        case 4 :
//        {
//          pushFollow(FOLLOW_numberExpression_in_date_expression162);
//          numberExpression5=numberExpression();
//
//          state._fsp--;
//
//          pushFollow(FOLLOW_unitsOfTime_in_date_expression164);
//          unitsOfTime4=unitsOfTime();
//
//          state._fsp--;
//
//          int alt4=3;
//          switch ( input.LA(1) ) {
//            case A:
//            {
//              int LA4_1 = input.LA(2);
//
//              if ( (LA4_1==G) ) {
//                alt4=1;
//              }
//              else if ( (LA4_1==F) ) {
//                alt4=3;
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 4, 1, input);
//
//                throw nvae;
//              }
//            }
//            break;
//            case F:
//            {
//              alt4=2;
//            }
//            break;
//            case B:
//            {
//              alt4=3;
//            }
//            break;
//            default:
//              NoViableAltException nvae =
//                      new NoViableAltException("", 4, 0, input);
//
//              throw nvae;
//          }
//
//          switch (alt4) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_ago_in_date_expression170);
//              ago();
//
//              state._fsp--;
//
//              delegate.add(unitsOfTime4, -1 * numberExpression5);
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_from_in_date_expression178);
//              from();
//
//              state._fsp--;
//
//              pushFollow(FOLLOW_date_expression_in_date_expression180);
//              date_expression();
//
//              state._fsp--;
//
//              delegate.add(unitsOfTime4, 1 * numberExpression5);
//
//            }
//            break;
//            case 3 :
//            {
//              pushFollow(FOLLOW_beforeOrAfter_in_date_expression188);
//              beforeOrAfter6=beforeOrAfter();
//
//              state._fsp--;
//
//              pushFollow(FOLLOW_date_expression_in_date_expression190);
//              date_expression();
//
//              state._fsp--;
//
//              delegate.add(unitsOfTime4, beforeOrAfter6 * numberExpression5);
//
//            }
//            break;
//
//          }
//
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "date_expression"
//
//
//  // $ANTLR start "weekdayExpression"
//  public final void weekdayExpression() throws RecognitionException {
//    int weekday7 = 0;
//
//
//    try {
//      {
//        pushFollow(FOLLOW_weekday_in_weekdayExpression204);
//        weekday7=weekday();
//
//        state._fsp--;
//
//        delegate.setDayOfWeek(weekday7);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "weekdayExpression"
//
//
//  // $ANTLR start "numberExpression"
//  public final int numberExpression() throws RecognitionException {
//    int value = 0;
//
//    DateParser_enParser.number_literal_return number_literal8 = null;
//
//    int number_word9 = 0;
//
//
//    try {
//      int alt7=3;
//      switch ( input.LA(1) ) {
//        case T:
//        {
//          int LA7_1 = input.LA(2);
//
//          if ( (LA7_1==H) ) {
//            int LA7_5 = input.LA(3);
//
//            if ( (LA7_5==E) ) {
//              alt7=1;
//            }
//            else if ( (LA7_5==R) ) {
//              alt7=3;
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 7, 5, input);
//
//              throw nvae;
//            }
//          }
//          else if ( (LA7_1==E||LA7_1==W) ) {
//            alt7=3;
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 7, 1, input);
//
//            throw nvae;
//          }
//        }
//        break;
//        case A:
//        {
//          alt7=1;
//        }
//        break;
//        case NUMBER_LITERAL:
//        {
//          alt7=2;
//        }
//        break;
//        case E:
//        case S:
//        case O:
//        case N:
//        case F:
//        {
//          alt7=3;
//        }
//        break;
//        default:
//          NoViableAltException nvae =
//                  new NoViableAltException("", 7, 0, input);
//
//          throw nvae;
//      }
//
//      switch (alt7) {
//        case 1 :
//        {
//          int alt6=2;
//          int LA6_0 = input.LA(1);
//
//          if ( (LA6_0==T) ) {
//            alt6=1;
//          }
//          else if ( (LA6_0==A) ) {
//            alt6=2;
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 6, 0, input);
//
//            throw nvae;
//          }
//          switch (alt6) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_the_in_numberExpression220);
//              the();
//
//              state._fsp--;
//
//
//            }
//            break;
//            case 2 :
//            {
//              match(input,A,FOLLOW_A_in_numberExpression224);
//
//            }
//            break;
//
//          }
//
//          value = 1;
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_number_literal_in_numberExpression234);
//          number_literal8=number_literal();
//
//          state._fsp--;
//
//          value = Integer.parseInt((number_literal8!=null?input.toString(number_literal8.start,number_literal8.stop):null));
//
//        }
//        break;
//        case 3 :
//        {
//          pushFollow(FOLLOW_number_word_in_numberExpression241);
//          number_word9=number_word();
//
//          state._fsp--;
//
//          value = number_word9;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return value;
//  }
//  // $ANTLR end "numberExpression"
//
//
//  // $ANTLR start "number_word"
//  public final int number_word() throws RecognitionException {
//    int value = 0;
//
//    try {
//      int alt8=10;
//      alt8 = dfa8.predict(input);
//      switch (alt8) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_one_in_number_word257);
//          one();
//
//          state._fsp--;
//
//          value = 1;
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_two_in_number_word265);
//          two();
//
//          state._fsp--;
//
//          value = 2;
//
//        }
//        break;
//        case 3 :
//        {
//          pushFollow(FOLLOW_three_in_number_word272);
//          three();
//
//          state._fsp--;
//
//          value = 3;
//
//        }
//        break;
//        case 4 :
//        {
//          pushFollow(FOLLOW_four_in_number_word279);
//          four();
//
//          state._fsp--;
//
//          value = 4;
//
//        }
//        break;
//        case 5 :
//        {
//          pushFollow(FOLLOW_five_in_number_word286);
//          five();
//
//          state._fsp--;
//
//          value = 5;
//
//        }
//        break;
//        case 6 :
//        {
//          pushFollow(FOLLOW_six_in_number_word293);
//          six();
//
//          state._fsp--;
//
//          value = 6;
//
//        }
//        break;
//        case 7 :
//        {
//          pushFollow(FOLLOW_seven_in_number_word300);
//          seven();
//
//          state._fsp--;
//
//          value = 7;
//
//        }
//        break;
//        case 8 :
//        {
//          pushFollow(FOLLOW_eight_in_number_word307);
//          eight();
//
//          state._fsp--;
//
//          value = 8;
//
//        }
//        break;
//        case 9 :
//        {
//          pushFollow(FOLLOW_nine_in_number_word314);
//          nine();
//
//          state._fsp--;
//
//          value = 9;
//
//        }
//        break;
//        case 10 :
//        {
//          pushFollow(FOLLOW_ten_in_number_word321);
//          ten();
//
//          state._fsp--;
//
//          value = 10;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return value;
//  }
//  // $ANTLR end "number_word"
//
//  public static class number_literal_return extends ParserRuleReturnScope {
//  };
//
//  // $ANTLR start "number_literal"
//  public final DateParser_enParser.number_literal_return number_literal() throws RecognitionException {
//    DateParser_enParser.number_literal_return retval = new DateParser_enParser.number_literal_return();
//    retval.start = input.LT(1);
//
//    try {
//      {
//        match(input,NUMBER_LITERAL,FOLLOW_NUMBER_LITERAL_in_number_literal332);
//
//      }
//
//      retval.stop = input.LT(-1);
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return retval;
//  }
//  // $ANTLR end "number_literal"
//
//
//  // $ANTLR start "date_literal"
//  public final void date_literal() throws RecognitionException {
//    try {
//      int alt9=4;
//      switch ( input.LA(1) ) {
//        case N:
//        {
//          alt9=1;
//        }
//        break;
//        case Y:
//        {
//          alt9=2;
//        }
//        break;
//        case T:
//        {
//          int LA9_3 = input.LA(2);
//
//          if ( (LA9_3==O) ) {
//            int LA9_4 = input.LA(3);
//
//            if ( (LA9_4==D) ) {
//              alt9=3;
//            }
//            else if ( (LA9_4==M) ) {
//              alt9=4;
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 9, 4, input);
//
//              throw nvae;
//            }
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 9, 3, input);
//
//            throw nvae;
//          }
//        }
//        break;
//        default:
//          NoViableAltException nvae =
//                  new NoViableAltException("", 9, 0, input);
//
//          throw nvae;
//      }
//
//      switch (alt9) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_now_in_date_literal343);
//          now();
//
//          state._fsp--;
//
//          delegate.today();
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_yesterday_in_date_literal352);
//          yesterday();
//
//          state._fsp--;
//
//          delegate.yesterday();
//
//        }
//        break;
//        case 3 :
//        {
//          pushFollow(FOLLOW_today_in_date_literal359);
//          today();
//
//          state._fsp--;
//
//          delegate.today();
//
//        }
//        break;
//        case 4 :
//        {
//          pushFollow(FOLLOW_tomorrow_in_date_literal367);
//          tomorrow();
//
//          state._fsp--;
//
//          delegate.tomorrow();
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "date_literal"
//
//
//  // $ANTLR start "weekday"
//  public final int weekday() throws RecognitionException {
//    int value = 0;
//
//    try {
//      int alt10=7;
//      alt10 = dfa10.predict(input);
//      switch (alt10) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_monday_in_weekday384);
//          monday();
//
//          state._fsp--;
//
//          value = Calendar.MONDAY;
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_tuesday_in_weekday392);
//          tuesday();
//
//          state._fsp--;
//
//          value = Calendar.TUESDAY;
//
//        }
//        break;
//        case 3 :
//        {
//          pushFollow(FOLLOW_wednesday_in_weekday399);
//          wednesday();
//
//          state._fsp--;
//
//          value = Calendar.WEDNESDAY;
//
//        }
//        break;
//        case 4 :
//        {
//          pushFollow(FOLLOW_thursday_in_weekday406);
//          thursday();
//
//          state._fsp--;
//
//          value = Calendar.THURSDAY;
//
//        }
//        break;
//        case 5 :
//        {
//          pushFollow(FOLLOW_friday_in_weekday413);
//          friday();
//
//          state._fsp--;
//
//          value = Calendar.FRIDAY;
//
//        }
//        break;
//        case 6 :
//        {
//          pushFollow(FOLLOW_saturday_in_weekday420);
//          saturday();
//
//          state._fsp--;
//
//          value = Calendar.SATURDAY;
//
//        }
//        break;
//        case 7 :
//        {
//          pushFollow(FOLLOW_sunday_in_weekday427);
//          sunday();
//
//          state._fsp--;
//
//          value = Calendar.SUNDAY;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return value;
//  }
//  // $ANTLR end "weekday"
//
//
//  // $ANTLR start "beforeOrAfter"
//  public final int beforeOrAfter() throws RecognitionException {
//    int direction = 0;
//
//    try {
//      int alt11=2;
//      int LA11_0 = input.LA(1);
//
//      if ( (LA11_0==B) ) {
//        alt11=1;
//      }
//      else if ( (LA11_0==A) ) {
//        alt11=2;
//      }
//      else {
//        NoViableAltException nvae =
//                new NoViableAltException("", 11, 0, input);
//
//        throw nvae;
//      }
//      switch (alt11) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_before_in_beforeOrAfter444);
//          before();
//
//          state._fsp--;
//
//          direction = -1;
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_after_in_beforeOrAfter451);
//          after();
//
//          state._fsp--;
//
//          direction = 1;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return direction;
//  }
//  // $ANTLR end "beforeOrAfter"
//
//
//  // $ANTLR start "nextOrLastExpression"
//  public final void nextOrLastExpression() throws RecognitionException {
//    int unitsOfTime10 = 0;
//
//    int weekday11 = 0;
//
//    int unitsOfTime12 = 0;
//
//    int weekday13 = 0;
//
//
//    try {
//      int alt14=2;
//      int LA14_0 = input.LA(1);
//
//      if ( (LA14_0==N) ) {
//        alt14=1;
//      }
//      else if ( (LA14_0==L) ) {
//        alt14=2;
//      }
//      else {
//        NoViableAltException nvae =
//                new NoViableAltException("", 14, 0, input);
//
//        throw nvae;
//      }
//      switch (alt14) {
//        case 1 :
//        {
//          pushFollow(FOLLOW_next_in_nextOrLastExpression464);
//          next();
//
//          state._fsp--;
//
//          int alt12=2;
//          switch ( input.LA(1) ) {
//            case Y:
//            case D:
//            {
//              alt12=1;
//            }
//            break;
//            case W:
//            {
//              int LA12_2 = input.LA(2);
//
//              if ( (LA12_2==E) ) {
//                int LA12_5 = input.LA(3);
//
//                if ( (LA12_5==E) ) {
//                  alt12=1;
//                }
//                else if ( (LA12_5==D) ) {
//                  alt12=2;
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 12, 5, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 12, 2, input);
//
//                throw nvae;
//              }
//            }
//            break;
//            case M:
//            {
//              int LA12_3 = input.LA(2);
//
//              if ( (LA12_3==O) ) {
//                int LA12_6 = input.LA(3);
//
//                if ( (LA12_6==N) ) {
//                  int LA12_7 = input.LA(4);
//
//                  if ( (LA12_7==T) ) {
//                    alt12=1;
//                  }
//                  else if ( (LA12_7==D) ) {
//                    alt12=2;
//                  }
//                  else {
//                    NoViableAltException nvae =
//                            new NoViableAltException("", 12, 7, input);
//
//                    throw nvae;
//                  }
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 12, 6, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 12, 3, input);
//
//                throw nvae;
//              }
//            }
//            break;
//            case S:
//            case T:
//            case F:
//            {
//              alt12=2;
//            }
//            break;
//            default:
//              NoViableAltException nvae =
//                      new NoViableAltException("", 12, 0, input);
//
//              throw nvae;
//          }
//
//          switch (alt12) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_unitsOfTime_in_nextOrLastExpression470);
//              unitsOfTime10=unitsOfTime();
//
//              state._fsp--;
//
//              delegate.add(unitsOfTime10, 1);
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_weekday_in_nextOrLastExpression478);
//              weekday11=weekday();
//
//              state._fsp--;
//
//              delegate.setNextOccurrenceDayOfWeek(weekday11);
//
//            }
//            break;
//
//          }
//
//
//        }
//        break;
//        case 2 :
//        {
//          pushFollow(FOLLOW_last_in_nextOrLastExpression488);
//          last();
//
//          state._fsp--;
//
//          int alt13=2;
//          switch ( input.LA(1) ) {
//            case Y:
//            case D:
//            {
//              alt13=1;
//            }
//            break;
//            case W:
//            {
//              int LA13_2 = input.LA(2);
//
//              if ( (LA13_2==E) ) {
//                int LA13_5 = input.LA(3);
//
//                if ( (LA13_5==E) ) {
//                  alt13=1;
//                }
//                else if ( (LA13_5==D) ) {
//                  alt13=2;
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 13, 5, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 13, 2, input);
//
//                throw nvae;
//              }
//            }
//            break;
//            case M:
//            {
//              int LA13_3 = input.LA(2);
//
//              if ( (LA13_3==O) ) {
//                int LA13_6 = input.LA(3);
//
//                if ( (LA13_6==N) ) {
//                  int LA13_7 = input.LA(4);
//
//                  if ( (LA13_7==T) ) {
//                    alt13=1;
//                  }
//                  else if ( (LA13_7==D) ) {
//                    alt13=2;
//                  }
//                  else {
//                    NoViableAltException nvae =
//                            new NoViableAltException("", 13, 7, input);
//
//                    throw nvae;
//                  }
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 13, 6, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 13, 3, input);
//
//                throw nvae;
//              }
//            }
//            break;
//            case S:
//            case T:
//            case F:
//            {
//              alt13=2;
//            }
//            break;
//            default:
//              NoViableAltException nvae =
//                      new NoViableAltException("", 13, 0, input);
//
//              throw nvae;
//          }
//
//          switch (alt13) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_unitsOfTime_in_nextOrLastExpression494);
//              unitsOfTime12=unitsOfTime();
//
//              state._fsp--;
//
//              delegate.add(unitsOfTime12, -1);
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_weekday_in_nextOrLastExpression502);
//              weekday13=weekday();
//
//              state._fsp--;
//
//              delegate.setLastOccurrenceDayOfWeek(weekday13);
//
//            }
//            break;
//
//          }
//
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "nextOrLastExpression"
//
//
//  // $ANTLR start "unitsOfTime"
//  public final int unitsOfTime() throws RecognitionException {
//    int unit = 0;
//
//    try {
//      int alt19=4;
//      switch ( input.LA(1) ) {
//        case D:
//        {
//          alt19=1;
//        }
//        break;
//        case W:
//        {
//          alt19=2;
//        }
//        break;
//        case M:
//        {
//          alt19=3;
//        }
//        break;
//        case Y:
//        {
//          alt19=4;
//        }
//        break;
//        default:
//          NoViableAltException nvae =
//                  new NoViableAltException("", 19, 0, input);
//
//          throw nvae;
//      }
//
//      switch (alt19) {
//        case 1 :
//        {
//          int alt15=2;
//          int LA15_0 = input.LA(1);
//
//          if ( (LA15_0==D) ) {
//            int LA15_1 = input.LA(2);
//
//            if ( (LA15_1==A) ) {
//              int LA15_2 = input.LA(3);
//
//              if ( (LA15_2==Y) ) {
//                int LA15_3 = input.LA(4);
//
//                if ( (LA15_3==S) ) {
//                  alt15=2;
//                }
//                else if ( (LA15_3==EOF||(LA15_3>=PLUS && LA15_3<=MINUS)||LA15_3==A||LA15_3==F||LA15_3==B) ) {
//                  alt15=1;
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 15, 3, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 15, 2, input);
//
//                throw nvae;
//              }
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 15, 1, input);
//
//              throw nvae;
//            }
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 15, 0, input);
//
//            throw nvae;
//          }
//          switch (alt15) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_day_in_unitsOfTime521);
//              day();
//
//              state._fsp--;
//
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_days_in_unitsOfTime523);
//              days();
//
//              state._fsp--;
//
//
//            }
//            break;
//
//          }
//
//          unit = Calendar.DAY_OF_YEAR;
//
//        }
//        break;
//        case 2 :
//        {
//          int alt16=2;
//          int LA16_0 = input.LA(1);
//
//          if ( (LA16_0==W) ) {
//            int LA16_1 = input.LA(2);
//
//            if ( (LA16_1==E) ) {
//              int LA16_2 = input.LA(3);
//
//              if ( (LA16_2==E) ) {
//                int LA16_3 = input.LA(4);
//
//                if ( (LA16_3==K) ) {
//                  int LA16_4 = input.LA(5);
//
//                  if ( (LA16_4==S) ) {
//                    alt16=2;
//                  }
//                  else if ( (LA16_4==EOF||(LA16_4>=PLUS && LA16_4<=MINUS)||LA16_4==A||LA16_4==F||LA16_4==B) ) {
//                    alt16=1;
//                  }
//                  else {
//                    NoViableAltException nvae =
//                            new NoViableAltException("", 16, 4, input);
//
//                    throw nvae;
//                  }
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 16, 3, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 16, 2, input);
//
//                throw nvae;
//              }
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 16, 1, input);
//
//              throw nvae;
//            }
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 16, 0, input);
//
//            throw nvae;
//          }
//          switch (alt16) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_week_in_unitsOfTime534);
//              week();
//
//              state._fsp--;
//
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_weeks_in_unitsOfTime536);
//              weeks();
//
//              state._fsp--;
//
//
//            }
//            break;
//
//          }
//
//          unit = Calendar.WEEK_OF_YEAR;
//
//        }
//        break;
//        case 3 :
//        {
//          int alt17=2;
//          int LA17_0 = input.LA(1);
//
//          if ( (LA17_0==M) ) {
//            int LA17_1 = input.LA(2);
//
//            if ( (LA17_1==O) ) {
//              int LA17_2 = input.LA(3);
//
//              if ( (LA17_2==N) ) {
//                int LA17_3 = input.LA(4);
//
//                if ( (LA17_3==T) ) {
//                  int LA17_4 = input.LA(5);
//
//                  if ( (LA17_4==H) ) {
//                    int LA17_5 = input.LA(6);
//
//                    if ( (LA17_5==S) ) {
//                      alt17=2;
//                    }
//                    else if ( (LA17_5==EOF||(LA17_5>=PLUS && LA17_5<=MINUS)||LA17_5==A||LA17_5==F||LA17_5==B) ) {
//                      alt17=1;
//                    }
//                    else {
//                      NoViableAltException nvae =
//                              new NoViableAltException("", 17, 5, input);
//
//                      throw nvae;
//                    }
//                  }
//                  else {
//                    NoViableAltException nvae =
//                            new NoViableAltException("", 17, 4, input);
//
//                    throw nvae;
//                  }
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 17, 3, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 17, 2, input);
//
//                throw nvae;
//              }
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 17, 1, input);
//
//              throw nvae;
//            }
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 17, 0, input);
//
//            throw nvae;
//          }
//          switch (alt17) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_month_in_unitsOfTime546);
//              month();
//
//              state._fsp--;
//
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_months_in_unitsOfTime548);
//              months();
//
//              state._fsp--;
//
//
//            }
//            break;
//
//          }
//
//          unit = Calendar.MONTH;
//
//        }
//        break;
//        case 4 :
//        {
//          int alt18=2;
//          int LA18_0 = input.LA(1);
//
//          if ( (LA18_0==Y) ) {
//            int LA18_1 = input.LA(2);
//
//            if ( (LA18_1==E) ) {
//              int LA18_2 = input.LA(3);
//
//              if ( (LA18_2==A) ) {
//                int LA18_3 = input.LA(4);
//
//                if ( (LA18_3==R) ) {
//                  int LA18_4 = input.LA(5);
//
//                  if ( (LA18_4==S) ) {
//                    alt18=2;
//                  }
//                  else if ( (LA18_4==EOF||(LA18_4>=PLUS && LA18_4<=MINUS)||LA18_4==A||LA18_4==F||LA18_4==B) ) {
//                    alt18=1;
//                  }
//                  else {
//                    NoViableAltException nvae =
//                            new NoViableAltException("", 18, 4, input);
//
//                    throw nvae;
//                  }
//                }
//                else {
//                  NoViableAltException nvae =
//                          new NoViableAltException("", 18, 3, input);
//
//                  throw nvae;
//                }
//              }
//              else {
//                NoViableAltException nvae =
//                        new NoViableAltException("", 18, 2, input);
//
//                throw nvae;
//              }
//            }
//            else {
//              NoViableAltException nvae =
//                      new NoViableAltException("", 18, 1, input);
//
//              throw nvae;
//            }
//          }
//          else {
//            NoViableAltException nvae =
//                    new NoViableAltException("", 18, 0, input);
//
//            throw nvae;
//          }
//          switch (alt18) {
//            case 1 :
//            {
//              pushFollow(FOLLOW_year_in_unitsOfTime557);
//              year();
//
//              state._fsp--;
//
//
//            }
//            break;
//            case 2 :
//            {
//              pushFollow(FOLLOW_years_in_unitsOfTime559);
//              years();
//
//              state._fsp--;
//
//
//            }
//            break;
//
//          }
//
//          unit = Calendar.YEAR;
//
//        }
//        break;
//
//      }
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return unit;
//  }
//  // $ANTLR end "unitsOfTime"
//
//
//  // $ANTLR start "yesterday"
//  public final void yesterday() throws RecognitionException {
//    try {
//      {
//        match(input,Y,FOLLOW_Y_in_yesterday571);
//        match(input,E,FOLLOW_E_in_yesterday573);
//        match(input,S,FOLLOW_S_in_yesterday575);
//        match(input,T,FOLLOW_T_in_yesterday577);
//        match(input,E,FOLLOW_E_in_yesterday579);
//        match(input,R,FOLLOW_R_in_yesterday581);
//        match(input,D,FOLLOW_D_in_yesterday583);
//        match(input,A,FOLLOW_A_in_yesterday585);
//        match(input,Y,FOLLOW_Y_in_yesterday587);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "yesterday"
//
//
//  // $ANTLR start "today"
//  public final void today() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_today595);
//        match(input,O,FOLLOW_O_in_today597);
//        match(input,D,FOLLOW_D_in_today599);
//        match(input,A,FOLLOW_A_in_today601);
//        match(input,Y,FOLLOW_Y_in_today603);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "today"
//
//
//  // $ANTLR start "tomorrow"
//  public final void tomorrow() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_tomorrow610);
//        match(input,O,FOLLOW_O_in_tomorrow612);
//        match(input,M,FOLLOW_M_in_tomorrow614);
//        match(input,O,FOLLOW_O_in_tomorrow616);
//        match(input,R,FOLLOW_R_in_tomorrow618);
//        match(input,R,FOLLOW_R_in_tomorrow620);
//        match(input,O,FOLLOW_O_in_tomorrow622);
//        match(input,W,FOLLOW_W_in_tomorrow624);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "tomorrow"
//
//
//  // $ANTLR start "day"
//  public final void day() throws RecognitionException {
//    try {
//      {
//        match(input,D,FOLLOW_D_in_day633);
//        match(input,A,FOLLOW_A_in_day635);
//        match(input,Y,FOLLOW_Y_in_day637);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "day"
//
//
//  // $ANTLR start "days"
//  public final void days() throws RecognitionException {
//    try {
//      {
//        match(input,D,FOLLOW_D_in_days645);
//        match(input,A,FOLLOW_A_in_days647);
//        match(input,Y,FOLLOW_Y_in_days649);
//        match(input,S,FOLLOW_S_in_days651);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "days"
//
//
//  // $ANTLR start "week"
//  public final void week() throws RecognitionException {
//    try {
//      {
//        match(input,W,FOLLOW_W_in_week659);
//        match(input,E,FOLLOW_E_in_week661);
//        match(input,E,FOLLOW_E_in_week663);
//        match(input,K,FOLLOW_K_in_week665);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "week"
//
//
//  // $ANTLR start "weeks"
//  public final void weeks() throws RecognitionException {
//    try {
//      {
//        match(input,W,FOLLOW_W_in_weeks673);
//        match(input,E,FOLLOW_E_in_weeks675);
//        match(input,E,FOLLOW_E_in_weeks677);
//        match(input,K,FOLLOW_K_in_weeks679);
//        match(input,S,FOLLOW_S_in_weeks681);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "weeks"
//
//
//  // $ANTLR start "month"
//  public final void month() throws RecognitionException {
//    try {
//      {
//        match(input,M,FOLLOW_M_in_month689);
//        match(input,O,FOLLOW_O_in_month691);
//        match(input,N,FOLLOW_N_in_month693);
//        match(input,T,FOLLOW_T_in_month695);
//        match(input,H,FOLLOW_H_in_month697);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "month"
//
//
//  // $ANTLR start "months"
//  public final void months() throws RecognitionException {
//    try {
//      {
//        match(input,M,FOLLOW_M_in_months705);
//        match(input,O,FOLLOW_O_in_months707);
//        match(input,N,FOLLOW_N_in_months709);
//        match(input,T,FOLLOW_T_in_months711);
//        match(input,H,FOLLOW_H_in_months713);
//        match(input,S,FOLLOW_S_in_months715);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "months"
//
//
//  // $ANTLR start "year"
//  public final void year() throws RecognitionException {
//    try {
//      {
//        match(input,Y,FOLLOW_Y_in_year723);
//        match(input,E,FOLLOW_E_in_year725);
//        match(input,A,FOLLOW_A_in_year727);
//        match(input,R,FOLLOW_R_in_year729);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "year"
//
//
//  // $ANTLR start "years"
//  public final void years() throws RecognitionException {
//    try {
//      {
//        match(input,Y,FOLLOW_Y_in_years737);
//        match(input,E,FOLLOW_E_in_years739);
//        match(input,A,FOLLOW_A_in_years741);
//        match(input,R,FOLLOW_R_in_years743);
//        match(input,S,FOLLOW_S_in_years745);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "years"
//
//
//  // $ANTLR start "monday"
//  public final void monday() throws RecognitionException {
//    try {
//      {
//        match(input,M,FOLLOW_M_in_monday754);
//        match(input,O,FOLLOW_O_in_monday756);
//        match(input,N,FOLLOW_N_in_monday758);
//        match(input,D,FOLLOW_D_in_monday760);
//        match(input,A,FOLLOW_A_in_monday762);
//        match(input,Y,FOLLOW_Y_in_monday764);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "monday"
//
//
//  // $ANTLR start "tuesday"
//  public final void tuesday() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_tuesday771);
//        match(input,U,FOLLOW_U_in_tuesday773);
//        match(input,E,FOLLOW_E_in_tuesday775);
//        match(input,S,FOLLOW_S_in_tuesday777);
//        match(input,D,FOLLOW_D_in_tuesday779);
//        match(input,A,FOLLOW_A_in_tuesday781);
//        match(input,Y,FOLLOW_Y_in_tuesday783);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "tuesday"
//
//
//  // $ANTLR start "wednesday"
//  public final void wednesday() throws RecognitionException {
//    try {
//      {
//        match(input,W,FOLLOW_W_in_wednesday790);
//        match(input,E,FOLLOW_E_in_wednesday792);
//        match(input,D,FOLLOW_D_in_wednesday794);
//        match(input,N,FOLLOW_N_in_wednesday796);
//        match(input,E,FOLLOW_E_in_wednesday798);
//        match(input,S,FOLLOW_S_in_wednesday800);
//        match(input,D,FOLLOW_D_in_wednesday802);
//        match(input,A,FOLLOW_A_in_wednesday804);
//        match(input,Y,FOLLOW_Y_in_wednesday806);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "wednesday"
//
//
//  // $ANTLR start "thursday"
//  public final void thursday() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_thursday813);
//        match(input,H,FOLLOW_H_in_thursday815);
//        match(input,U,FOLLOW_U_in_thursday817);
//        match(input,R,FOLLOW_R_in_thursday819);
//        match(input,S,FOLLOW_S_in_thursday821);
//        match(input,D,FOLLOW_D_in_thursday823);
//        match(input,A,FOLLOW_A_in_thursday825);
//        match(input,Y,FOLLOW_Y_in_thursday827);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "thursday"
//
//
//  // $ANTLR start "friday"
//  public final void friday() throws RecognitionException {
//    try {
//      {
//        match(input,F,FOLLOW_F_in_friday835);
//        match(input,R,FOLLOW_R_in_friday837);
//        match(input,I,FOLLOW_I_in_friday839);
//        match(input,D,FOLLOW_D_in_friday841);
//        match(input,A,FOLLOW_A_in_friday843);
//        match(input,Y,FOLLOW_Y_in_friday845);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "friday"
//
//
//  // $ANTLR start "saturday"
//  public final void saturday() throws RecognitionException {
//    try {
//      {
//        match(input,S,FOLLOW_S_in_saturday852);
//        match(input,A,FOLLOW_A_in_saturday854);
//        match(input,T,FOLLOW_T_in_saturday856);
//        match(input,U,FOLLOW_U_in_saturday858);
//        match(input,R,FOLLOW_R_in_saturday860);
//        match(input,D,FOLLOW_D_in_saturday862);
//        match(input,A,FOLLOW_A_in_saturday864);
//        match(input,Y,FOLLOW_Y_in_saturday866);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "saturday"
//
//
//  // $ANTLR start "sunday"
//  public final void sunday() throws RecognitionException {
//    try {
//      {
//        match(input,S,FOLLOW_S_in_sunday874);
//        match(input,U,FOLLOW_U_in_sunday876);
//        match(input,N,FOLLOW_N_in_sunday878);
//        match(input,D,FOLLOW_D_in_sunday880);
//        match(input,A,FOLLOW_A_in_sunday882);
//        match(input,Y,FOLLOW_Y_in_sunday884);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "sunday"
//
//
//  // $ANTLR start "one"
//  public final void one() throws RecognitionException {
//    try {
//      {
//        match(input,O,FOLLOW_O_in_one892);
//        match(input,N,FOLLOW_N_in_one894);
//        match(input,E,FOLLOW_E_in_one896);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "one"
//
//
//  // $ANTLR start "two"
//  public final void two() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_two903);
//        match(input,W,FOLLOW_W_in_two905);
//        match(input,O,FOLLOW_O_in_two907);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "two"
//
//
//  // $ANTLR start "three"
//  public final void three() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_three914);
//        match(input,H,FOLLOW_H_in_three916);
//        match(input,R,FOLLOW_R_in_three918);
//        match(input,E,FOLLOW_E_in_three920);
//        match(input,E,FOLLOW_E_in_three922);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "three"
//
//
//  // $ANTLR start "four"
//  public final void four() throws RecognitionException {
//    try {
//      {
//        match(input,F,FOLLOW_F_in_four929);
//        match(input,O,FOLLOW_O_in_four931);
//        match(input,U,FOLLOW_U_in_four933);
//        match(input,R,FOLLOW_R_in_four935);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "four"
//
//
//  // $ANTLR start "five"
//  public final void five() throws RecognitionException {
//    try {
//      {
//        match(input,F,FOLLOW_F_in_five942);
//        match(input,I,FOLLOW_I_in_five944);
//        match(input,V,FOLLOW_V_in_five946);
//        match(input,E,FOLLOW_E_in_five948);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "five"
//
//
//  // $ANTLR start "six"
//  public final void six() throws RecognitionException {
//    try {
//      {
//        match(input,S,FOLLOW_S_in_six955);
//        match(input,I,FOLLOW_I_in_six957);
//        match(input,X,FOLLOW_X_in_six959);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "six"
//
//
//  // $ANTLR start "seven"
//  public final void seven() throws RecognitionException {
//    try {
//      {
//        match(input,S,FOLLOW_S_in_seven966);
//        match(input,E,FOLLOW_E_in_seven968);
//        match(input,V,FOLLOW_V_in_seven970);
//        match(input,E,FOLLOW_E_in_seven972);
//        match(input,N,FOLLOW_N_in_seven974);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "seven"
//
//
//  // $ANTLR start "eight"
//  public final void eight() throws RecognitionException {
//    try {
//      {
//        match(input,E,FOLLOW_E_in_eight981);
//        match(input,I,FOLLOW_I_in_eight983);
//        match(input,G,FOLLOW_G_in_eight985);
//        match(input,H,FOLLOW_H_in_eight987);
//        match(input,T,FOLLOW_T_in_eight989);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "eight"
//
//
//  // $ANTLR start "nine"
//  public final void nine() throws RecognitionException {
//    try {
//      {
//        match(input,N,FOLLOW_N_in_nine996);
//        match(input,I,FOLLOW_I_in_nine998);
//        match(input,N,FOLLOW_N_in_nine1000);
//        match(input,E,FOLLOW_E_in_nine1002);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "nine"
//
//
//  // $ANTLR start "ten"
//  public final void ten() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_ten1009);
//        match(input,E,FOLLOW_E_in_ten1011);
//        match(input,N,FOLLOW_N_in_ten1013);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "ten"
//
//
//  // $ANTLR start "next"
//  public final void next() throws RecognitionException {
//    try {
//      {
//        match(input,N,FOLLOW_N_in_next1022);
//        match(input,E,FOLLOW_E_in_next1024);
//        match(input,X,FOLLOW_X_in_next1026);
//        match(input,T,FOLLOW_T_in_next1028);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "next"
//
//
//  // $ANTLR start "last"
//  public final void last() throws RecognitionException {
//    try {
//      {
//        match(input,L,FOLLOW_L_in_last1036);
//        match(input,A,FOLLOW_A_in_last1038);
//        match(input,S,FOLLOW_S_in_last1040);
//        match(input,T,FOLLOW_T_in_last1042);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "last"
//
//
//  // $ANTLR start "before"
//  public final void before() throws RecognitionException {
//    try {
//      {
//        match(input,B,FOLLOW_B_in_before1050);
//        match(input,E,FOLLOW_E_in_before1052);
//        match(input,F,FOLLOW_F_in_before1054);
//        match(input,O,FOLLOW_O_in_before1056);
//        match(input,R,FOLLOW_R_in_before1058);
//        match(input,E,FOLLOW_E_in_before1060);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "before"
//
//
//  // $ANTLR start "after"
//  public final void after() throws RecognitionException {
//    try {
//      {
//        match(input,A,FOLLOW_A_in_after1068);
//        match(input,F,FOLLOW_F_in_after1070);
//        match(input,T,FOLLOW_T_in_after1072);
//        match(input,E,FOLLOW_E_in_after1074);
//        match(input,R,FOLLOW_R_in_after1076);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "after"
//
//
//  // $ANTLR start "the"
//  public final void the() throws RecognitionException {
//    try {
//      {
//        match(input,T,FOLLOW_T_in_the1085);
//        match(input,H,FOLLOW_H_in_the1087);
//        match(input,E,FOLLOW_E_in_the1089);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "the"
//
//
//  // $ANTLR start "ago"
//  public final void ago() throws RecognitionException {
//    try {
//      {
//        match(input,A,FOLLOW_A_in_ago1097);
//        match(input,G,FOLLOW_G_in_ago1099);
//        match(input,O,FOLLOW_O_in_ago1101);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "ago"
//
//
//  // $ANTLR start "from"
//  public final void from() throws RecognitionException {
//    try {
//      {
//        match(input,F,FOLLOW_F_in_from1109);
//        match(input,R,FOLLOW_R_in_from1111);
//        match(input,O,FOLLOW_O_in_from1113);
//        match(input,M,FOLLOW_M_in_from1115);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "from"
//
//
//  // $ANTLR start "now"
//  public final void now() throws RecognitionException {
//    try {
//      {
//        match(input,N,FOLLOW_N_in_now1123);
//        match(input,O,FOLLOW_O_in_now1125);
//        match(input,W,FOLLOW_W_in_now1127);
//
//      }
//
//    }
//    catch (RecognitionException re) {
//      reportError(re);
//      recover(input,re);
//    }
//    finally {
//    }
//    return ;
//  }
//  // $ANTLR end "now"
//
//  // Delegated rules
//
//
//  protected DFA5 dfa5 = new DFA5(this);
//  protected DFA8 dfa8 = new DFA8(this);
//  protected DFA10 dfa10 = new DFA10(this);
//  static final String DFA5_eotS =
//          "\12\uffff";
//  static final String DFA5_eofS =
//          "\12\uffff";
//  static final String DFA5_minS =
//          "\1\7\1\12\1\uffff\1\12\2\uffff\1\15\1\7\1\uffff\1\12";
//  static final String DFA5_maxS =
//          "\1\33\1\27\1\uffff\1\25\2\uffff\2\27\1\uffff\1\25";
//  static final String DFA5_acceptS =
//          "\2\uffff\1\1\1\uffff\1\2\1\3\2\uffff\1\4\1\uffff";
//  static final String DFA5_specialS =
//          "\12\uffff}>";
//  static final String[] DFA5_transitionS = {
//          "\2\10\1\2\1\10\1\7\1\3\2\uffff\1\10\2\5\1\uffff\1\1\2\uffff"+
//                  "\1\6\4\uffff\1\4",
//          "\1\4\4\uffff\1\2\7\uffff\1\10",
//          "",
//          "\1\10\4\uffff\1\2\1\uffff\1\10\2\uffff\1\11\1\5",
//          "",
//          "",
//          "\1\5\1\uffff\1\10\7\uffff\1\10",
//          "\1\5\2\uffff\1\10\12\uffff\1\5\1\uffff\1\10",
//          "",
//          "\1\10\2\uffff\1\10\7\uffff\1\5"
//  };
//
//  static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
//  static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
//  static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
//  static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
//  static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
//  static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
//  static final short[][] DFA5_transition;
//
//  static {
//    int numStates = DFA5_transitionS.length;
//    DFA5_transition = new short[numStates][];
//    for (int i=0; i<numStates; i++) {
//      DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
//    }
//  }
//
//  class DFA5 extends DFA {
//
//    public DFA5(BaseRecognizer recognizer) {
//      this.recognizer = recognizer;
//      this.decisionNumber = 5;
//      this.eot = DFA5_eot;
//      this.eof = DFA5_eof;
//      this.min = DFA5_min;
//      this.max = DFA5_max;
//      this.accept = DFA5_accept;
//      this.special = DFA5_special;
//      this.transition = DFA5_transition;
//    }
//    public String getDescription() {
//      return "45:1: date_expression : ( date_literal | nextOrLastExpression | weekdayExpression | numberExpression unitsOfTime ( ago | from date_expression | beforeOrAfter date_expression ) );";
//    }
//  }
//  static final String DFA8_eotS =
//          "\16\uffff";
//  static final String DFA8_eofS =
//          "\16\uffff";
//  static final String DFA8_minS =
//          "\1\12\1\uffff\1\12\1\17\1\12\11\uffff";
//  static final String DFA8_maxS =
//          "\1\26\1\uffff\1\24\2\27\11\uffff";
//  static final String DFA8_acceptS =
//          "\1\uffff\1\1\3\uffff\1\10\1\11\1\2\1\3\1\12\1\4\1\5\1\6\1\7";
//  static final String DFA8_specialS =
//          "\16\uffff}>";
//  static final String[] DFA8_transitionS = {
//          "\1\5\1\4\1\2\2\uffff\1\1\3\uffff\1\6\2\uffff\1\3",
//          "",
//          "\1\11\6\uffff\1\7\2\uffff\1\10",
//          "\1\12\7\uffff\1\13",
//          "\1\15\14\uffff\1\14",
//          "",
//          "",
//          "",
//          "",
//          "",
//          "",
//          "",
//          "",
//          ""
//  };
//
//  static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
//  static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
//  static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
//  static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
//  static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
//  static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
//  static final short[][] DFA8_transition;
//
//  static {
//    int numStates = DFA8_transitionS.length;
//    DFA8_transition = new short[numStates][];
//    for (int i=0; i<numStates; i++) {
//      DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
//    }
//  }
//
//  class DFA8 extends DFA {
//
//    public DFA8(BaseRecognizer recognizer) {
//      this.recognizer = recognizer;
//      this.decisionNumber = 8;
//      this.eot = DFA8_eot;
//      this.eof = DFA8_eof;
//      this.min = DFA8_min;
//      this.max = DFA8_max;
//      this.accept = DFA8_accept;
//      this.special = DFA8_special;
//      this.transition = DFA8_transition;
//    }
//    public String getDescription() {
//      return "66:1: number_word returns [int value] : ( one | two | three | four | five | six | seven | eight | nine | ten );";
//    }
//  }
//  static final String DFA10_eotS =
//          "\12\uffff";
//  static final String DFA10_eofS =
//          "\12\uffff";
//  static final String DFA10_minS =
//          "\1\13\1\uffff\1\24\2\uffff\1\7\4\uffff";
//  static final String DFA10_maxS =
//          "\1\26\1\uffff\1\25\2\uffff\1\25\4\uffff";
//  static final String DFA10_acceptS =
//          "\1\uffff\1\1\1\uffff\1\3\1\5\1\uffff\1\2\1\4\1\6\1\7";
//  static final String DFA10_specialS =
//          "\12\uffff}>";
//  static final String[] DFA10_transitionS = {
//          "\1\5\1\2\3\uffff\1\1\1\3\4\uffff\1\4",
//          "",
//          "\1\7\1\6",
//          "",
//          "",
//          "\1\10\15\uffff\1\11",
//          "",
//          "",
//          "",
//          ""
//  };
//
//  static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
//  static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
//  static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
//  static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
//  static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
//  static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
//  static final short[][] DFA10_transition;
//
//  static {
//    int numStates = DFA10_transitionS.length;
//    DFA10_transition = new short[numStates][];
//    for (int i=0; i<numStates; i++) {
//      DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
//    }
//  }
//
//  class DFA10 extends DFA {
//
//    public DFA10(BaseRecognizer recognizer) {
//      this.recognizer = recognizer;
//      this.decisionNumber = 10;
//      this.eot = DFA10_eot;
//      this.eof = DFA10_eof;
//      this.min = DFA10_min;
//      this.max = DFA10_max;
//      this.accept = DFA10_accept;
//      this.special = DFA10_special;
//      this.transition = DFA10_transition;
//    }
//    public String getDescription() {
//      return "94:1: weekday returns [int value] : ( monday | tuesday | wednesday | thursday | friday | saturday | sunday );";
//    }
//  }
//
//
//  public static final BitSet FOLLOW_EOF_in_date_string80 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_date_expression_in_date_string86 = new BitSet(new long[]{0x0000000000000032L});
//  public static final BitSet FOLLOW_date_modifier_in_date_string88 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_date_modifier_in_date_string95 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_PLUS_in_binary_operator114 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_MINUS_in_binary_operator121 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_binary_operator_in_date_modifier132 = new BitSet(new long[]{0x0000000000489D80L});
//  public static final BitSet FOLLOW_numberExpression_in_date_modifier134 = new BitSet(new long[]{0x0000000000034200L});
//  public static final BitSet FOLLOW_unitsOfTime_in_date_modifier136 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_date_literal_in_date_expression147 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_nextOrLastExpression_in_date_expression152 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_weekdayExpression_in_date_expression157 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_numberExpression_in_date_expression162 = new BitSet(new long[]{0x0000000000034200L});
//  public static final BitSet FOLLOW_unitsOfTime_in_date_expression164 = new BitSet(new long[]{0x0000000010400080L});
//  public static final BitSet FOLLOW_ago_in_date_expression170 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_from_in_date_expression178 = new BitSet(new long[]{0x00000000084B9F80L});
//  public static final BitSet FOLLOW_date_expression_in_date_expression180 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_beforeOrAfter_in_date_expression188 = new BitSet(new long[]{0x00000000084B9F80L});
//  public static final BitSet FOLLOW_date_expression_in_date_expression190 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_weekday_in_weekdayExpression204 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_the_in_numberExpression220 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_A_in_numberExpression224 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_number_literal_in_numberExpression234 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_number_word_in_numberExpression241 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_one_in_number_word257 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_two_in_number_word265 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_three_in_number_word272 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_four_in_number_word279 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_five_in_number_word286 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_six_in_number_word293 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_seven_in_number_word300 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_eight_in_number_word307 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_nine_in_number_word314 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_ten_in_number_word321 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_NUMBER_LITERAL_in_number_literal332 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_now_in_date_literal343 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_yesterday_in_date_literal352 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_today_in_date_literal359 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_tomorrow_in_date_literal367 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_monday_in_weekday384 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_tuesday_in_weekday392 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_wednesday_in_weekday399 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_thursday_in_weekday406 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_friday_in_weekday413 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_saturday_in_weekday420 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_sunday_in_weekday427 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_before_in_beforeOrAfter444 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_after_in_beforeOrAfter451 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_next_in_nextOrLastExpression464 = new BitSet(new long[]{0x0000000000435A00L});
//  public static final BitSet FOLLOW_unitsOfTime_in_nextOrLastExpression470 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_weekday_in_nextOrLastExpression478 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_last_in_nextOrLastExpression488 = new BitSet(new long[]{0x0000000000435A00L});
//  public static final BitSet FOLLOW_unitsOfTime_in_nextOrLastExpression494 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_weekday_in_nextOrLastExpression502 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_day_in_unitsOfTime521 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_days_in_unitsOfTime523 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_week_in_unitsOfTime534 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_weeks_in_unitsOfTime536 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_month_in_unitsOfTime546 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_months_in_unitsOfTime548 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_year_in_unitsOfTime557 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_years_in_unitsOfTime559 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_Y_in_yesterday571 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_yesterday573 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_yesterday575 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_yesterday577 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_yesterday579 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_yesterday581 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_yesterday583 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_yesterday585 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_yesterday587 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_today595 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_today597 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_today599 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_today601 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_today603 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_tomorrow610 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_tomorrow612 = new BitSet(new long[]{0x0000000000010000L});
//  public static final BitSet FOLLOW_M_in_tomorrow614 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_tomorrow616 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_tomorrow618 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_tomorrow620 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_tomorrow622 = new BitSet(new long[]{0x0000000000020000L});
//  public static final BitSet FOLLOW_W_in_tomorrow624 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_D_in_day633 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_day635 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_day637 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_D_in_days645 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_days647 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_days649 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_days651 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_W_in_week659 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_week661 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_week663 = new BitSet(new long[]{0x0000000000040000L});
//  public static final BitSet FOLLOW_K_in_week665 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_W_in_weeks673 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_weeks675 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_weeks677 = new BitSet(new long[]{0x0000000000040000L});
//  public static final BitSet FOLLOW_K_in_weeks679 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_weeks681 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_M_in_month689 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_month691 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_month693 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_month695 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_month697 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_M_in_months705 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_months707 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_months709 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_months711 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_months713 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_months715 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_Y_in_year723 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_year725 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_year727 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_year729 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_Y_in_years737 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_years739 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_years741 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_years743 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_years745 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_M_in_monday754 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_monday756 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_monday758 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_monday760 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_monday762 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_monday764 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_tuesday771 = new BitSet(new long[]{0x0000000000200000L});
//  public static final BitSet FOLLOW_U_in_tuesday773 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_tuesday775 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_tuesday777 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_tuesday779 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_tuesday781 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_tuesday783 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_W_in_wednesday790 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_wednesday792 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_wednesday794 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_wednesday796 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_wednesday798 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_wednesday800 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_wednesday802 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_wednesday804 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_wednesday806 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_thursday813 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_thursday815 = new BitSet(new long[]{0x0000000000200000L});
//  public static final BitSet FOLLOW_U_in_thursday817 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_thursday819 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_thursday821 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_thursday823 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_thursday825 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_thursday827 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_F_in_friday835 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_friday837 = new BitSet(new long[]{0x0000000000800000L});
//  public static final BitSet FOLLOW_I_in_friday839 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_friday841 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_friday843 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_friday845 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_S_in_saturday852 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_saturday854 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_saturday856 = new BitSet(new long[]{0x0000000000200000L});
//  public static final BitSet FOLLOW_U_in_saturday858 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_saturday860 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_saturday862 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_saturday864 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_saturday866 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_S_in_sunday874 = new BitSet(new long[]{0x0000000000200000L});
//  public static final BitSet FOLLOW_U_in_sunday876 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_sunday878 = new BitSet(new long[]{0x0000000000004000L});
//  public static final BitSet FOLLOW_D_in_sunday880 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_sunday882 = new BitSet(new long[]{0x0000000000000200L});
//  public static final BitSet FOLLOW_Y_in_sunday884 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_O_in_one892 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_one894 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_one896 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_two903 = new BitSet(new long[]{0x0000000000020000L});
//  public static final BitSet FOLLOW_W_in_two905 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_two907 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_three914 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_three916 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_three918 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_three920 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_three922 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_F_in_four929 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_four931 = new BitSet(new long[]{0x0000000000200000L});
//  public static final BitSet FOLLOW_U_in_four933 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_four935 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_F_in_five942 = new BitSet(new long[]{0x0000000000800000L});
//  public static final BitSet FOLLOW_I_in_five944 = new BitSet(new long[]{0x0000000001000000L});
//  public static final BitSet FOLLOW_V_in_five946 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_five948 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_S_in_six955 = new BitSet(new long[]{0x0000000000800000L});
//  public static final BitSet FOLLOW_I_in_six957 = new BitSet(new long[]{0x0000000002000000L});
//  public static final BitSet FOLLOW_X_in_six959 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_S_in_seven966 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_seven968 = new BitSet(new long[]{0x0000000001000000L});
//  public static final BitSet FOLLOW_V_in_seven970 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_seven972 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_seven974 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_E_in_eight981 = new BitSet(new long[]{0x0000000000800000L});
//  public static final BitSet FOLLOW_I_in_eight983 = new BitSet(new long[]{0x0000000004000000L});
//  public static final BitSet FOLLOW_G_in_eight985 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_eight987 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_eight989 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_N_in_nine996 = new BitSet(new long[]{0x0000000000800000L});
//  public static final BitSet FOLLOW_I_in_nine998 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_nine1000 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_nine1002 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_ten1009 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_ten1011 = new BitSet(new long[]{0x0000000000080000L});
//  public static final BitSet FOLLOW_N_in_ten1013 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_N_in_next1022 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_next1024 = new BitSet(new long[]{0x0000000002000000L});
//  public static final BitSet FOLLOW_X_in_next1026 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_next1028 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_L_in_last1036 = new BitSet(new long[]{0x0000000000000080L});
//  public static final BitSet FOLLOW_A_in_last1038 = new BitSet(new long[]{0x0000000000000800L});
//  public static final BitSet FOLLOW_S_in_last1040 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_last1042 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_B_in_before1050 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_before1052 = new BitSet(new long[]{0x0000000000400000L});
//  public static final BitSet FOLLOW_F_in_before1054 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_before1056 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_before1058 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_before1060 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_A_in_after1068 = new BitSet(new long[]{0x0000000000400000L});
//  public static final BitSet FOLLOW_F_in_after1070 = new BitSet(new long[]{0x0000000000001000L});
//  public static final BitSet FOLLOW_T_in_after1072 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_after1074 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_after1076 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_T_in_the1085 = new BitSet(new long[]{0x0000000000100000L});
//  public static final BitSet FOLLOW_H_in_the1087 = new BitSet(new long[]{0x0000000000000400L});
//  public static final BitSet FOLLOW_E_in_the1089 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_A_in_ago1097 = new BitSet(new long[]{0x0000000004000000L});
//  public static final BitSet FOLLOW_G_in_ago1099 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_ago1101 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_F_in_from1109 = new BitSet(new long[]{0x0000000000002000L});
//  public static final BitSet FOLLOW_R_in_from1111 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_from1113 = new BitSet(new long[]{0x0000000000010000L});
//  public static final BitSet FOLLOW_M_in_from1115 = new BitSet(new long[]{0x0000000000000002L});
//  public static final BitSet FOLLOW_N_in_now1123 = new BitSet(new long[]{0x0000000000008000L});
//  public static final BitSet FOLLOW_O_in_now1125 = new BitSet(new long[]{0x0000000000020000L});
//  public static final BitSet FOLLOW_W_in_now1127 = new BitSet(new long[]{0x0000000000000002L});
//
//}