package kotlin.reflect.jvm.internal.impl.util;

import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* compiled from: OperatorNameConventions.kt */
public final class OperatorNameConventions {
    public static final Name AND;
    public static final Set<Name> ASSIGNMENT_OPERATIONS = SetsKt.setOf(TIMES_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, REM_ASSIGN, PLUS_ASSIGN, MINUS_ASSIGN);
    public static final Set<Name> BINARY_OPERATION_NAMES = SetsKt.setOf(TIMES, PLUS, MINUS, DIV, MOD, REM, RANGE_TO);
    public static final Name COMPARE_TO;
    public static final Regex COMPONENT_REGEX = new Regex("component\\d+");
    public static final Name CONTAINS;
    public static final Name DEC;
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS = SetsKt.setOf(GET_VALUE, SET_VALUE, PROVIDE_DELEGATE);
    public static final Name DIV;
    public static final Name DIV_ASSIGN;
    public static final Name EQUALS;
    public static final Name GET;
    public static final Name GET_VALUE;
    public static final Name HAS_NEXT;
    public static final Name INC;
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();
    public static final Name INV;
    public static final Name INVOKE;
    public static final Name ITERATOR;
    public static final Name MINUS;
    public static final Name MINUS_ASSIGN;
    public static final Name MOD;
    public static final Name MOD_ASSIGN;
    public static final Name NEXT;
    public static final Name NOT;

    /* renamed from: OR */
    public static final Name f12959OR;
    public static final Name PLUS;
    public static final Name PLUS_ASSIGN;
    public static final Name PROVIDE_DELEGATE;
    public static final Name RANGE_TO;
    public static final Name REM;
    public static final Name REM_ASSIGN;
    public static final Name SET;
    public static final Name SET_VALUE;
    public static final Name SHL;
    public static final Name SHR;
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES = SetsKt.setOf(UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name TIMES;
    public static final Name TIMES_ASSIGN;
    public static final Name TO_STRING;
    public static final Name UNARY_MINUS;
    public static final Set<Name> UNARY_OPERATION_NAMES = SetsKt.setOf(INC, DEC, UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name UNARY_PLUS;
    public static final Name USHR;
    public static final Name XOR;

    private OperatorNameConventions() {
    }

    static {
        Name identifier = Name.identifier("getValue");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"getValue\")");
        GET_VALUE = identifier;
        Name identifier2 = Name.identifier("setValue");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(\"setValue\")");
        SET_VALUE = identifier2;
        Name identifier3 = Name.identifier("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(\"provideDelegate\")");
        PROVIDE_DELEGATE = identifier3;
        Name identifier4 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(identifier4, "identifier(\"equals\")");
        EQUALS = identifier4;
        Name identifier5 = Name.identifier("compareTo");
        Intrinsics.checkNotNullExpressionValue(identifier5, "identifier(\"compareTo\")");
        COMPARE_TO = identifier5;
        Name identifier6 = Name.identifier("contains");
        Intrinsics.checkNotNullExpressionValue(identifier6, "identifier(\"contains\")");
        CONTAINS = identifier6;
        Name identifier7 = Name.identifier("invoke");
        Intrinsics.checkNotNullExpressionValue(identifier7, "identifier(\"invoke\")");
        INVOKE = identifier7;
        Name identifier8 = Name.identifier("iterator");
        Intrinsics.checkNotNullExpressionValue(identifier8, "identifier(\"iterator\")");
        ITERATOR = identifier8;
        Name identifier9 = Name.identifier(Constants.GET);
        Intrinsics.checkNotNullExpressionValue(identifier9, "identifier(\"get\")");
        GET = identifier9;
        Name identifier10 = Name.identifier("set");
        Intrinsics.checkNotNullExpressionValue(identifier10, "identifier(\"set\")");
        SET = identifier10;
        Name identifier11 = Name.identifier("next");
        Intrinsics.checkNotNullExpressionValue(identifier11, "identifier(\"next\")");
        NEXT = identifier11;
        Name identifier12 = Name.identifier("hasNext");
        Intrinsics.checkNotNullExpressionValue(identifier12, "identifier(\"hasNext\")");
        HAS_NEXT = identifier12;
        Name identifier13 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(identifier13, "identifier(\"toString\")");
        TO_STRING = identifier13;
        Name identifier14 = Name.identifier("and");
        Intrinsics.checkNotNullExpressionValue(identifier14, "identifier(\"and\")");
        AND = identifier14;
        Name identifier15 = Name.identifier("or");
        Intrinsics.checkNotNullExpressionValue(identifier15, "identifier(\"or\")");
        f12959OR = identifier15;
        Name identifier16 = Name.identifier("xor");
        Intrinsics.checkNotNullExpressionValue(identifier16, "identifier(\"xor\")");
        XOR = identifier16;
        Name identifier17 = Name.identifier("inv");
        Intrinsics.checkNotNullExpressionValue(identifier17, "identifier(\"inv\")");
        INV = identifier17;
        Name identifier18 = Name.identifier("shl");
        Intrinsics.checkNotNullExpressionValue(identifier18, "identifier(\"shl\")");
        SHL = identifier18;
        Name identifier19 = Name.identifier("shr");
        Intrinsics.checkNotNullExpressionValue(identifier19, "identifier(\"shr\")");
        SHR = identifier19;
        Name identifier20 = Name.identifier("ushr");
        Intrinsics.checkNotNullExpressionValue(identifier20, "identifier(\"ushr\")");
        USHR = identifier20;
        Name identifier21 = Name.identifier("inc");
        Intrinsics.checkNotNullExpressionValue(identifier21, "identifier(\"inc\")");
        INC = identifier21;
        Name identifier22 = Name.identifier("dec");
        Intrinsics.checkNotNullExpressionValue(identifier22, "identifier(\"dec\")");
        DEC = identifier22;
        Name identifier23 = Name.identifier("plus");
        Intrinsics.checkNotNullExpressionValue(identifier23, "identifier(\"plus\")");
        PLUS = identifier23;
        Name identifier24 = Name.identifier("minus");
        Intrinsics.checkNotNullExpressionValue(identifier24, "identifier(\"minus\")");
        MINUS = identifier24;
        Name identifier25 = Name.identifier("not");
        Intrinsics.checkNotNullExpressionValue(identifier25, "identifier(\"not\")");
        NOT = identifier25;
        Name identifier26 = Name.identifier("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(identifier26, "identifier(\"unaryMinus\")");
        UNARY_MINUS = identifier26;
        Name identifier27 = Name.identifier("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(identifier27, "identifier(\"unaryPlus\")");
        UNARY_PLUS = identifier27;
        Name identifier28 = Name.identifier("times");
        Intrinsics.checkNotNullExpressionValue(identifier28, "identifier(\"times\")");
        TIMES = identifier28;
        Name identifier29 = Name.identifier("div");
        Intrinsics.checkNotNullExpressionValue(identifier29, "identifier(\"div\")");
        DIV = identifier29;
        Name identifier30 = Name.identifier("mod");
        Intrinsics.checkNotNullExpressionValue(identifier30, "identifier(\"mod\")");
        MOD = identifier30;
        Name identifier31 = Name.identifier("rem");
        Intrinsics.checkNotNullExpressionValue(identifier31, "identifier(\"rem\")");
        REM = identifier31;
        Name identifier32 = Name.identifier("rangeTo");
        Intrinsics.checkNotNullExpressionValue(identifier32, "identifier(\"rangeTo\")");
        RANGE_TO = identifier32;
        Name identifier33 = Name.identifier("timesAssign");
        Intrinsics.checkNotNullExpressionValue(identifier33, "identifier(\"timesAssign\")");
        TIMES_ASSIGN = identifier33;
        Name identifier34 = Name.identifier("divAssign");
        Intrinsics.checkNotNullExpressionValue(identifier34, "identifier(\"divAssign\")");
        DIV_ASSIGN = identifier34;
        Name identifier35 = Name.identifier("modAssign");
        Intrinsics.checkNotNullExpressionValue(identifier35, "identifier(\"modAssign\")");
        MOD_ASSIGN = identifier35;
        Name identifier36 = Name.identifier("remAssign");
        Intrinsics.checkNotNullExpressionValue(identifier36, "identifier(\"remAssign\")");
        REM_ASSIGN = identifier36;
        Name identifier37 = Name.identifier("plusAssign");
        Intrinsics.checkNotNullExpressionValue(identifier37, "identifier(\"plusAssign\")");
        PLUS_ASSIGN = identifier37;
        Name identifier38 = Name.identifier("minusAssign");
        Intrinsics.checkNotNullExpressionValue(identifier38, "identifier(\"minusAssign\")");
        MINUS_ASSIGN = identifier38;
    }
}
