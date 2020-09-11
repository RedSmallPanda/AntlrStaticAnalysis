package myApplication;

import gen.*;

public class AntlrTestListener extends HplsqlBaseListener {
    @Override
    public void enterProgram(HplsqlParser.ProgramContext ctx){
        System.out.println("Hello Antlr!");
    }

    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx){
        System.out.println("Start selecting sth.");
    }

    @Override
    public void exitSelect_stmt(HplsqlParser.Select_stmtContext ctx){
        System.out.println("I have selected sth.");
    }

    @Override
    public void enterSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx){
        System.out.println("Be careful! Using \"*\" will cause poor performance!");
    }
}
