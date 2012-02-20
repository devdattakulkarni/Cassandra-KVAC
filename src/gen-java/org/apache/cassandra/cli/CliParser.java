// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g 2011-10-05 15:01:54

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_DESCRIBE_CLUSTER", "NODE_USE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_VERSION", "NODE_SHOW_KEYSPACES", "NODE_SHOW_SCHEMA", "NODE_THRIFT_GET", "NODE_THRIFT_GET_WITH_CONDITIONS", "NODE_THRIFT_SET", "NODE_THRIFT_COUNT", "NODE_THRIFT_DEL", "NODE_THRIFT_INCR", "NODE_THRIFT_DECR", "NODE_ADD_COLUMN_FAMILY", "NODE_ADD_KEYSPACE", "NODE_DEL_KEYSPACE", "NODE_DEL_COLUMN_FAMILY", "NODE_UPDATE_KEYSPACE", "NODE_UPDATE_COLUMN_FAMILY", "NODE_LIST", "NODE_TRUNCATE", "NODE_ASSUME", "NODE_CONSISTENCY_LEVEL", "NODE_DROP_INDEX", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "NODE_NEW_CF_ACCESS", "NODE_NEW_KEYSPACE_ACCESS", "CONVERT_TO_TYPE", "FUNCTION_CALL", "CONDITION", "CONDITIONS", "ARRAY", "HASH", "PAIR", "NODE_LIMIT", "NODE_KEY_RANGE", "SEMICOLON", "CONNECT", "HELP", "USE", "DESCRIBE", "KEYSPACE", "EXIT", "QUIT", "SHOW", "KEYSPACES", "SCHEMA", "API_VERSION", "CREATE", "UPDATE", "COLUMN", "FAMILY", "DROP", "INDEX", "GET", "SET", "INCR", "DECR", "DEL", "COUNT", "LIST", "TRUNCATE", "ASSUME", "CONSISTENCYLEVEL", "IntegerPositiveLiteral", "Identifier", "StringLiteral", "WITH", "TTL", "BY", "ON", "AND", "IntegerNegativeLiteral", "DoubleLiteral", "IP_ADDRESS", "CONFIG", "FILE", "LIMIT", "Letter", "Digit", "Alnum", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "WS", "COMMENT", "'/'", "'CLUSTER'", "'CLUSTER NAME'", "'?'", "'AS'", "'WHERE'", "'='", "'>'", "'<'", "'>='", "'<='", "'.'", "'['", "','", "']'", "'{'", "'}'", "':'", "'('", "')'"
    };
    public static final int NODE_THRIFT_GET_WITH_CONDITIONS=16;
    public static final int TTL=78;
    public static final int NODE_SHOW_KEYSPACES=13;
    public static final int CONDITION=39;
    public static final int COUNT=69;
    public static final int DecimalDigit=99;
    public static final int EOF=-1;
    public static final int Identifier=75;
    public static final int NODE_UPDATE_COLUMN_FAMILY=27;
    public static final int SingleStringCharacter=91;
    public static final int NODE_USE_TABLE=7;
    public static final int NODE_DEL_KEYSPACE=24;
    public static final int CREATE=58;
    public static final int NODE_CONNECT=4;
    public static final int CONNECT=47;
    public static final int INCR=66;
    public static final int SingleEscapeCharacter=96;
    public static final int FAMILY=61;
    public static final int GET=64;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int COMMENT=102;
    public static final int SHOW=54;
    public static final int ARRAY=41;
    public static final int NODE_ADD_KEYSPACE=23;
    public static final int EXIT=52;
    public static final int NODE_THRIFT_DEL=19;
    public static final int IntegerNegativeLiteral=82;
    public static final int ON=80;
    public static final int NODE_DROP_INDEX=32;
    public static final int SEMICOLON=46;
    public static final int KEYSPACES=55;
    public static final int CONDITIONS=40;
    public static final int FILE=86;
    public static final int NODE_LIMIT=44;
    public static final int LIST=70;
    public static final int NODE_DESCRIBE_CLUSTER=6;
    public static final int IP_ADDRESS=84;
    public static final int NODE_THRIFT_SET=17;
    public static final int NODE_NO_OP=10;
    public static final int NODE_ID_LIST=34;
    public static final int WS=101;
    public static final int ASSUME=72;
    public static final int NODE_THRIFT_COUNT=18;
    public static final int DESCRIBE=50;
    public static final int Alnum=90;
    public static final int CharacterEscapeSequence=93;
    public static final int NODE_SHOW_CLUSTER_NAME=11;
    public static final int USE=49;
    public static final int NODE_THRIFT_DECR=21;
    public static final int FUNCTION_CALL=38;
    public static final int EscapeSequence=92;
    public static final int Letter=88;
    public static final int DoubleLiteral=83;
    public static final int HELP=48;
    public static final int HexEscapeSequence=94;
    public static final int NODE_EXIT=8;
    public static final int LIMIT=87;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int DEL=68;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int NODE_SHOW_SCHEMA=14;
    public static final int T__115=115;
    public static final int NODE_LIST=28;
    public static final int UPDATE=59;
    public static final int T__122=122;
    public static final int NODE_UPDATE_KEYSPACE=26;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int AND=81;
    public static final int NODE_NEW_CF_ACCESS=35;
    public static final int CONSISTENCYLEVEL=73;
    public static final int HexDigit=100;
    public static final int QUIT=53;
    public static final int NODE_TRUNCATE=29;
    public static final int INDEX=63;
    public static final int NODE_SHOW_VERSION=12;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int NODE_NEW_KEYSPACE_ACCESS=36;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int TRUNCATE=71;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int COLUMN=60;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int EscapeCharacter=98;
    public static final int T__112=112;
    public static final int PAIR=43;
    public static final int NODE_CONSISTENCY_LEVEL=31;
    public static final int WITH=77;
    public static final int BY=79;
    public static final int UnicodeEscapeSequence=95;
    public static final int HASH=42;
    public static final int SET=65;
    public static final int Digit=89;
    public static final int API_VERSION=57;
    public static final int NODE_ASSUME=30;
    public static final int CONVERT_TO_TYPE=37;
    public static final int NODE_THRIFT_GET=15;
    public static final int NODE_DEL_COLUMN_FAMILY=25;
    public static final int NODE_KEY_RANGE=45;
    public static final int KEYSPACE=51;
    public static final int StringLiteral=76;
    public static final int NODE_HELP=9;
    public static final int CONFIG=85;
    public static final int IntegerPositiveLiteral=74;
    public static final int SCHEMA=56;
    public static final int DROP=62;
    public static final int NonEscapeCharacter=97;
    public static final int DECR=67;
    public static final int NODE_ADD_COLUMN_FAMILY=22;
    public static final int NODE_THRIFT_INCR=20;
    public static final int NODE_COLUMN_ACCESS=33;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g"; }


        public void reportError(RecognitionException e) 
        {
            String errorMessage;

            if (e instanceof NoViableAltException)
            {
                errorMessage = "Command not found: `" + this.input + "`. Type 'help;' or '?' for help.";
            }
            else
            {
                errorMessage = "Syntax error at position " + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames());
            }

            throw new RuntimeException(errorMessage);
        }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:140:1: root : statement ( SEMICOLON )? EOF -> statement ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.statement_return statement1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:140:5: ( statement ( SEMICOLON )? EOF -> statement )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:140:7: statement ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_statement_in_root421);
            statement1=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:140:17: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:32: -> statement
            {
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:142:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) );
    public final CliParser.statement_return statement() throws RecognitionException {
        CliParser.statement_return retval = new CliParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStatement_return connectStatement4 = null;

        CliParser.exitStatement_return exitStatement5 = null;

        CliParser.countStatement_return countStatement6 = null;

        CliParser.describeTable_return describeTable7 = null;

        CliParser.describeCluster_return describeCluster8 = null;

        CliParser.addKeyspace_return addKeyspace9 = null;

        CliParser.addColumnFamily_return addColumnFamily10 = null;

        CliParser.updateKeyspace_return updateKeyspace11 = null;

        CliParser.updateColumnFamily_return updateColumnFamily12 = null;

        CliParser.delColumnFamily_return delColumnFamily13 = null;

        CliParser.delKeyspace_return delKeyspace14 = null;

        CliParser.useKeyspace_return useKeyspace15 = null;

        CliParser.delStatement_return delStatement16 = null;

        CliParser.getStatement_return getStatement17 = null;

        CliParser.helpStatement_return helpStatement18 = null;

        CliParser.setStatement_return setStatement19 = null;

        CliParser.incrStatement_return incrStatement20 = null;

        CliParser.showStatement_return showStatement21 = null;

        CliParser.listStatement_return listStatement22 = null;

        CliParser.truncateStatement_return truncateStatement23 = null;

        CliParser.assumeStatement_return assumeStatement24 = null;

        CliParser.consistencyLevelStatement_return consistencyLevelStatement25 = null;

        CliParser.dropIndex_return dropIndex26 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:143:5: ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) )
            int alt2=24;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:143:7: connectStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStatement_in_statement442);
                    connectStatement4=connectStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStatement4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:144:7: exitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStatement_in_statement450);
                    exitStatement5=exitStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStatement5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:145:7: countStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_countStatement_in_statement458);
                    countStatement6=countStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, countStatement6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:146:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_statement466);
                    describeTable7=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:147:7: describeCluster
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeCluster_in_statement474);
                    describeCluster8=describeCluster();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeCluster8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:148:7: addKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addKeyspace_in_statement482);
                    addKeyspace9=addKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addKeyspace9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:149:7: addColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_addColumnFamily_in_statement490);
                    addColumnFamily10=addColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addColumnFamily10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:150:7: updateKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateKeyspace_in_statement498);
                    updateKeyspace11=updateKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateKeyspace11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:151:7: updateColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_updateColumnFamily_in_statement506);
                    updateColumnFamily12=updateColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, updateColumnFamily12.getTree());

                    }
                    break;
                case 10 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:152:7: delColumnFamily
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delColumnFamily_in_statement514);
                    delColumnFamily13=delColumnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delColumnFamily13.getTree());

                    }
                    break;
                case 11 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:153:7: delKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delKeyspace_in_statement522);
                    delKeyspace14=delKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delKeyspace14.getTree());

                    }
                    break;
                case 12 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:154:7: useKeyspace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_useKeyspace_in_statement530);
                    useKeyspace15=useKeyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useKeyspace15.getTree());

                    }
                    break;
                case 13 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:155:7: delStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_delStatement_in_statement538);
                    delStatement16=delStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delStatement16.getTree());

                    }
                    break;
                case 14 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:156:7: getStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStatement_in_statement546);
                    getStatement17=getStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStatement17.getTree());

                    }
                    break;
                case 15 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:157:7: helpStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStatement_in_statement554);
                    helpStatement18=helpStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStatement18.getTree());

                    }
                    break;
                case 16 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:158:7: setStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStatement_in_statement562);
                    setStatement19=setStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStatement19.getTree());

                    }
                    break;
                case 17 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:159:7: incrStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_incrStatement_in_statement570);
                    incrStatement20=incrStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incrStatement20.getTree());

                    }
                    break;
                case 18 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:160:7: showStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStatement_in_statement578);
                    showStatement21=showStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStatement21.getTree());

                    }
                    break;
                case 19 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:161:7: listStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listStatement_in_statement586);
                    listStatement22=listStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listStatement22.getTree());

                    }
                    break;
                case 20 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:162:7: truncateStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_truncateStatement_in_statement594);
                    truncateStatement23=truncateStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, truncateStatement23.getTree());

                    }
                    break;
                case 21 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:163:7: assumeStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assumeStatement_in_statement602);
                    assumeStatement24=assumeStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assumeStatement24.getTree());

                    }
                    break;
                case 22 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:164:7: consistencyLevelStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_consistencyLevelStatement_in_statement610);
                    consistencyLevelStatement25=consistencyLevelStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, consistencyLevelStatement25.getTree());

                    }
                    break;
                case 23 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:165:7: dropIndex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dropIndex_in_statement618);
                    dropIndex26=dropIndex();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dropIndex26.getTree());

                    }
                    break;
                case 24 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:166:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 166:7: -> ^( NODE_NO_OP )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:166:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class connectStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:169:1: connectStatement : ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) );
    public final CliParser.connectStatement_return connectStatement() throws RecognitionException {
        CliParser.connectStatement_return retval = new CliParser.connectStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONNECT27=null;
        Token char_literal29=null;
        Token CONNECT33=null;
        Token char_literal35=null;
        CliParser.host_return host28 = null;

        CliParser.port_return port30 = null;

        CliParser.username_return username31 = null;

        CliParser.password_return password32 = null;

        CliParser.ip_address_return ip_address34 = null;

        CliParser.port_return port36 = null;

        CliParser.username_return username37 = null;

        CliParser.password_return password38 = null;


        CommonTree CONNECT27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree CONNECT33_tree=null;
        CommonTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_ip_address=new RewriteRuleSubtreeStream(adaptor,"rule ip_address");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:170:5: ( CONNECT host '/' port ( username password )? -> ^( NODE_CONNECT host port ( username password )? ) | CONNECT ip_address '/' port ( username password )? -> ^( NODE_CONNECT ip_address port ( username password )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CONNECT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==IP_ADDRESS) ) {
                    alt5=2;
                }
                else if ( (LA5_1==Identifier) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:170:7: CONNECT host '/' port ( username password )?
                    {
                    CONNECT27=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT27);

                    pushFollow(FOLLOW_host_in_connectStatement649);
                    host28=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host28.getTree());
                    char_literal29=(Token)match(input,103,FOLLOW_103_in_connectStatement651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(char_literal29);

                    pushFollow(FOLLOW_port_in_connectStatement653);
                    port30=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port30.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:170:29: ( username password )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:170:30: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement656);
                            username31=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username31.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement658);
                            password32=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password32.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: username, port, host, password
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 171:9: -> ^( NODE_CONNECT host port ( username password )? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:171:12: ^( NODE_CONNECT host port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:171:37: ( username password )?
                        if ( stream_username.hasNext()||stream_password.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_username.reset();
                        stream_password.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:172:7: CONNECT ip_address '/' port ( username password )?
                    {
                    CONNECT33=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_connectStatement693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT33);

                    pushFollow(FOLLOW_ip_address_in_connectStatement695);
                    ip_address34=ip_address();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip_address.add(ip_address34.getTree());
                    char_literal35=(Token)match(input,103,FOLLOW_103_in_connectStatement697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(char_literal35);

                    pushFollow(FOLLOW_port_in_connectStatement699);
                    port36=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port36.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:172:35: ( username password )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identifier) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:172:36: username password
                            {
                            pushFollow(FOLLOW_username_in_connectStatement702);
                            username37=username();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_username.add(username37.getTree());
                            pushFollow(FOLLOW_password_in_connectStatement704);
                            password38=password();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_password.add(password38.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ip_address, port, password, username
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:9: -> ^( NODE_CONNECT ip_address port ( username password )? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:173:12: ^( NODE_CONNECT ip_address port ( username password )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip_address.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:173:43: ( username password )?
                        if ( stream_password.hasNext()||stream_username.hasNext() ) {
                            adaptor.addChild(root_1, stream_username.nextTree());
                            adaptor.addChild(root_1, stream_password.nextTree());

                        }
                        stream_password.reset();
                        stream_username.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStatement"

    public static class helpStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:176:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStatement_return helpStatement() throws RecognitionException {
        CliParser.helpStatement_return retval = new CliParser.helpStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HELP39=null;
        Token HELP40=null;
        Token HELP41=null;
        Token CONNECT42=null;
        Token HELP43=null;
        Token USE44=null;
        Token HELP45=null;
        Token DESCRIBE46=null;
        Token KEYSPACE47=null;
        Token HELP48=null;
        Token DESCRIBE49=null;
        Token string_literal50=null;
        Token HELP51=null;
        Token EXIT52=null;
        Token HELP53=null;
        Token QUIT54=null;
        Token HELP55=null;
        Token SHOW56=null;
        Token string_literal57=null;
        Token HELP58=null;
        Token SHOW59=null;
        Token KEYSPACES60=null;
        Token HELP61=null;
        Token SHOW62=null;
        Token SCHEMA63=null;
        Token HELP64=null;
        Token SHOW65=null;
        Token API_VERSION66=null;
        Token HELP67=null;
        Token CREATE68=null;
        Token KEYSPACE69=null;
        Token HELP70=null;
        Token UPDATE71=null;
        Token KEYSPACE72=null;
        Token HELP73=null;
        Token CREATE74=null;
        Token COLUMN75=null;
        Token FAMILY76=null;
        Token HELP77=null;
        Token UPDATE78=null;
        Token COLUMN79=null;
        Token FAMILY80=null;
        Token HELP81=null;
        Token DROP82=null;
        Token KEYSPACE83=null;
        Token HELP84=null;
        Token DROP85=null;
        Token COLUMN86=null;
        Token FAMILY87=null;
        Token HELP88=null;
        Token DROP89=null;
        Token INDEX90=null;
        Token HELP91=null;
        Token GET92=null;
        Token HELP93=null;
        Token SET94=null;
        Token HELP95=null;
        Token INCR96=null;
        Token HELP97=null;
        Token DECR98=null;
        Token HELP99=null;
        Token DEL100=null;
        Token HELP101=null;
        Token COUNT102=null;
        Token HELP103=null;
        Token LIST104=null;
        Token HELP105=null;
        Token TRUNCATE106=null;
        Token HELP107=null;
        Token ASSUME108=null;
        Token HELP109=null;
        Token CONSISTENCYLEVEL110=null;
        Token HELP111=null;
        Token char_literal112=null;

        CommonTree HELP39_tree=null;
        CommonTree HELP40_tree=null;
        CommonTree HELP41_tree=null;
        CommonTree CONNECT42_tree=null;
        CommonTree HELP43_tree=null;
        CommonTree USE44_tree=null;
        CommonTree HELP45_tree=null;
        CommonTree DESCRIBE46_tree=null;
        CommonTree KEYSPACE47_tree=null;
        CommonTree HELP48_tree=null;
        CommonTree DESCRIBE49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree HELP51_tree=null;
        CommonTree EXIT52_tree=null;
        CommonTree HELP53_tree=null;
        CommonTree QUIT54_tree=null;
        CommonTree HELP55_tree=null;
        CommonTree SHOW56_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree HELP58_tree=null;
        CommonTree SHOW59_tree=null;
        CommonTree KEYSPACES60_tree=null;
        CommonTree HELP61_tree=null;
        CommonTree SHOW62_tree=null;
        CommonTree SCHEMA63_tree=null;
        CommonTree HELP64_tree=null;
        CommonTree SHOW65_tree=null;
        CommonTree API_VERSION66_tree=null;
        CommonTree HELP67_tree=null;
        CommonTree CREATE68_tree=null;
        CommonTree KEYSPACE69_tree=null;
        CommonTree HELP70_tree=null;
        CommonTree UPDATE71_tree=null;
        CommonTree KEYSPACE72_tree=null;
        CommonTree HELP73_tree=null;
        CommonTree CREATE74_tree=null;
        CommonTree COLUMN75_tree=null;
        CommonTree FAMILY76_tree=null;
        CommonTree HELP77_tree=null;
        CommonTree UPDATE78_tree=null;
        CommonTree COLUMN79_tree=null;
        CommonTree FAMILY80_tree=null;
        CommonTree HELP81_tree=null;
        CommonTree DROP82_tree=null;
        CommonTree KEYSPACE83_tree=null;
        CommonTree HELP84_tree=null;
        CommonTree DROP85_tree=null;
        CommonTree COLUMN86_tree=null;
        CommonTree FAMILY87_tree=null;
        CommonTree HELP88_tree=null;
        CommonTree DROP89_tree=null;
        CommonTree INDEX90_tree=null;
        CommonTree HELP91_tree=null;
        CommonTree GET92_tree=null;
        CommonTree HELP93_tree=null;
        CommonTree SET94_tree=null;
        CommonTree HELP95_tree=null;
        CommonTree INCR96_tree=null;
        CommonTree HELP97_tree=null;
        CommonTree DECR98_tree=null;
        CommonTree HELP99_tree=null;
        CommonTree DEL100_tree=null;
        CommonTree HELP101_tree=null;
        CommonTree COUNT102_tree=null;
        CommonTree HELP103_tree=null;
        CommonTree LIST104_tree=null;
        CommonTree HELP105_tree=null;
        CommonTree TRUNCATE106_tree=null;
        CommonTree HELP107_tree=null;
        CommonTree ASSUME108_tree=null;
        CommonTree HELP109_tree=null;
        CommonTree CONSISTENCYLEVEL110_tree=null;
        CommonTree HELP111_tree=null;
        CommonTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_HELP=new RewriteRuleTokenStream(adaptor,"token HELP");
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_CONNECT=new RewriteRuleTokenStream(adaptor,"token CONNECT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:177:5: ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt6=30;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:177:7: HELP HELP
                    {
                    HELP39=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP39);

                    HELP40=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:9: -> ^( NODE_HELP NODE_HELP )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:178:12: ^( NODE_HELP NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:179:7: HELP CONNECT
                    {
                    HELP41=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP41);

                    CONNECT42=(Token)match(input,CONNECT,FOLLOW_CONNECT_in_helpStatement777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONNECT.add(CONNECT42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:9: -> ^( NODE_HELP NODE_CONNECT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:180:12: ^( NODE_HELP NODE_CONNECT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:181:7: HELP USE
                    {
                    HELP43=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP43);

                    USE44=(Token)match(input,USE,FOLLOW_USE_in_helpStatement804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(USE44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 182:9: -> ^( NODE_HELP NODE_USE_TABLE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:182:12: ^( NODE_HELP NODE_USE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:183:7: HELP DESCRIBE KEYSPACE
                    {
                    HELP45=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP45);

                    DESCRIBE46=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE46);

                    KEYSPACE47=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:9: -> ^( NODE_HELP NODE_DESCRIBE_TABLE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:184:12: ^( NODE_HELP NODE_DESCRIBE_TABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:185:7: HELP DESCRIBE 'CLUSTER'
                    {
                    HELP48=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP48);

                    DESCRIBE49=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_helpStatement860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE49);

                    string_literal50=(Token)match(input,104,FOLLOW_104_in_helpStatement862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(string_literal50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:9: -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:186:12: ^( NODE_HELP NODE_DESCRIBE_CLUSTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:187:7: HELP EXIT
                    {
                    HELP51=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP51);

                    EXIT52=(Token)match(input,EXIT,FOLLOW_EXIT_in_helpStatement888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:188:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:189:7: HELP QUIT
                    {
                    HELP53=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP53);

                    QUIT54=(Token)match(input,QUIT,FOLLOW_QUIT_in_helpStatement915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:9: -> ^( NODE_HELP NODE_EXIT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:190:12: ^( NODE_HELP NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:191:7: HELP SHOW 'CLUSTER NAME'
                    {
                    HELP55=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP55);

                    SHOW56=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW56);

                    string_literal57=(Token)match(input,105,FOLLOW_105_in_helpStatement944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:9: -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:192:12: ^( NODE_HELP NODE_SHOW_CLUSTER_NAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:193:7: HELP SHOW KEYSPACES
                    {
                    HELP58=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP58);

                    SHOW59=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW59);

                    KEYSPACES60=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_helpStatement972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:9: -> ^( NODE_HELP NODE_SHOW_KEYSPACES )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:194:12: ^( NODE_HELP NODE_SHOW_KEYSPACES )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:195:7: HELP SHOW SCHEMA
                    {
                    HELP61=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP61);

                    SHOW62=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW62);

                    SCHEMA63=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_helpStatement1001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:13: -> ^( NODE_HELP NODE_SHOW_SCHEMA )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:196:16: ^( NODE_HELP NODE_SHOW_SCHEMA )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:197:7: HELP SHOW API_VERSION
                    {
                    HELP64=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP64);

                    SHOW65=(Token)match(input,SHOW,FOLLOW_SHOW_in_helpStatement1031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SHOW.add(SHOW65);

                    API_VERSION66=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_helpStatement1033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:9: -> ^( NODE_HELP NODE_SHOW_VERSION )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:198:12: ^( NODE_HELP NODE_SHOW_VERSION )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:199:7: HELP CREATE KEYSPACE
                    {
                    HELP67=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP67);

                    CREATE68=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE68);

                    KEYSPACE69=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:9: -> ^( NODE_HELP NODE_ADD_KEYSPACE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:200:12: ^( NODE_HELP NODE_ADD_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:201:7: HELP UPDATE KEYSPACE
                    {
                    HELP70=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP70);

                    UPDATE71=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE71);

                    KEYSPACE72=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 202:9: -> ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:202:12: ^( NODE_HELP NODE_UPDATE_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:203:7: HELP CREATE COLUMN FAMILY
                    {
                    HELP73=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP73);

                    CREATE74=(Token)match(input,CREATE,FOLLOW_CREATE_in_helpStatement1116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CREATE.add(CREATE74);

                    COLUMN75=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN75);

                    FAMILY76=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:9: -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:204:12: ^( NODE_HELP NODE_ADD_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:205:7: HELP UPDATE COLUMN FAMILY
                    {
                    HELP77=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP77);

                    UPDATE78=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_helpStatement1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE78);

                    COLUMN79=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN79);

                    FAMILY80=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:9: -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:206:12: ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:207:7: HELP DROP KEYSPACE
                    {
                    HELP81=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP81);

                    DROP82=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP82);

                    KEYSPACE83=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_helpStatement1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:9: -> ^( NODE_HELP NODE_DEL_KEYSPACE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:208:12: ^( NODE_HELP NODE_DEL_KEYSPACE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:209:7: HELP DROP COLUMN FAMILY
                    {
                    HELP84=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP84);

                    DROP85=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP85);

                    COLUMN86=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_helpStatement1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN86);

                    FAMILY87=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_helpStatement1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:210:12: ^( NODE_HELP NODE_DEL_COLUMN_FAMILY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:211:7: HELP DROP INDEX
                    {
                    HELP88=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP88);

                    DROP89=(Token)match(input,DROP,FOLLOW_DROP_in_helpStatement1237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DROP.add(DROP89);

                    INDEX90=(Token)match(input,INDEX,FOLLOW_INDEX_in_helpStatement1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDEX.add(INDEX90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( NODE_HELP NODE_DROP_INDEX )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:212:12: ^( NODE_HELP NODE_DROP_INDEX )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:213:7: HELP GET
                    {
                    HELP91=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP91);

                    GET92=(Token)match(input,GET,FOLLOW_GET_in_helpStatement1265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( NODE_HELP NODE_THRIFT_GET )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:214:12: ^( NODE_HELP NODE_THRIFT_GET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:215:7: HELP SET
                    {
                    HELP93=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP93);

                    SET94=(Token)match(input,SET,FOLLOW_SET_in_helpStatement1292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( NODE_HELP NODE_THRIFT_SET )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:216:12: ^( NODE_HELP NODE_THRIFT_SET )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:217:7: HELP INCR
                    {
                    HELP95=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP95);

                    INCR96=(Token)match(input,INCR,FOLLOW_INCR_in_helpStatement1319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( NODE_HELP NODE_THRIFT_INCR )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:218:12: ^( NODE_HELP NODE_THRIFT_INCR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:219:7: HELP DECR
                    {
                    HELP97=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP97);

                    DECR98=(Token)match(input,DECR,FOLLOW_DECR_in_helpStatement1345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:9: -> ^( NODE_HELP NODE_THRIFT_DECR )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:220:12: ^( NODE_HELP NODE_THRIFT_DECR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:221:7: HELP DEL
                    {
                    HELP99=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP99);

                    DEL100=(Token)match(input,DEL,FOLLOW_DEL_in_helpStatement1371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEL.add(DEL100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:9: -> ^( NODE_HELP NODE_THRIFT_DEL )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:222:12: ^( NODE_HELP NODE_THRIFT_DEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:223:7: HELP COUNT
                    {
                    HELP101=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP101);

                    COUNT102=(Token)match(input,COUNT,FOLLOW_COUNT_in_helpStatement1398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COUNT.add(COUNT102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 224:9: -> ^( NODE_HELP NODE_THRIFT_COUNT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:224:12: ^( NODE_HELP NODE_THRIFT_COUNT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:225:7: HELP LIST
                    {
                    HELP103=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP103);

                    LIST104=(Token)match(input,LIST,FOLLOW_LIST_in_helpStatement1425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST.add(LIST104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:9: -> ^( NODE_HELP NODE_LIST )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:226:12: ^( NODE_HELP NODE_LIST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:227:7: HELP TRUNCATE
                    {
                    HELP105=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP105);

                    TRUNCATE106=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_helpStatement1452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE106);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:9: -> ^( NODE_HELP NODE_TRUNCATE )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:228:12: ^( NODE_HELP NODE_TRUNCATE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:229:7: HELP ASSUME
                    {
                    HELP107=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP107);

                    ASSUME108=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_helpStatement1478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:9: -> ^( NODE_HELP NODE_ASSUME )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:230:12: ^( NODE_HELP NODE_ASSUME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:231:7: HELP CONSISTENCYLEVEL
                    {
                    HELP109=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP109);

                    CONSISTENCYLEVEL110=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_helpStatement1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:9: -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:232:12: ^( NODE_HELP NODE_CONSISTENCY_LEVEL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:233:7: HELP
                    {
                    HELP111=(Token)match(input,HELP,FOLLOW_HELP_in_helpStatement1528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HELP.add(HELP111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:9: -> ^( NODE_HELP )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:234:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:235:7: '?'
                    {
                    char_literal112=(Token)match(input,106,FOLLOW_106_in_helpStatement1551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:9: -> ^( NODE_HELP )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:236:12: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStatement"

    public static class exitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:239:1: exitStatement : ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStatement_return exitStatement() throws RecognitionException {
        CliParser.exitStatement_return retval = new CliParser.exitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUIT113=null;
        Token EXIT114=null;

        CommonTree QUIT113_tree=null;
        CommonTree EXIT114_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_QUIT=new RewriteRuleTokenStream(adaptor,"token QUIT");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:240:5: ( QUIT -> ^( NODE_EXIT ) | EXIT -> ^( NODE_EXIT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUIT) ) {
                alt7=1;
            }
            else if ( (LA7_0==EXIT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:240:7: QUIT
                    {
                    QUIT113=(Token)match(input,QUIT,FOLLOW_QUIT_in_exitStatement1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUIT.add(QUIT113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:12: -> ^( NODE_EXIT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:240:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:241:7: EXIT
                    {
                    EXIT114=(Token)match(input,EXIT,FOLLOW_EXIT_in_exitStatement1600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXIT.add(EXIT114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 241:12: -> ^( NODE_EXIT )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:241:15: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStatement"

    public static class getStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:244:1: getStatement : ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) );
    public final CliParser.getStatement_return getStatement() throws RecognitionException {
        CliParser.getStatement_return retval = new CliParser.getStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token GET115=null;
        Token string_literal117=null;
        Token string_literal119=null;
        Token GET120=null;
        Token string_literal122=null;
        Token string_literal124=null;
        Token string_literal126=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr116 = null;

        CliParser.typeIdentifier_return typeIdentifier118 = null;

        CliParser.columnFamily_return columnFamily121 = null;

        CliParser.getCondition_return getCondition123 = null;

        CliParser.getCondition_return getCondition125 = null;


        CommonTree limit_tree=null;
        CommonTree GET115_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree GET120_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal126_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_getCondition=new RewriteRuleSubtreeStream(adaptor,"rule getCondition");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:5: ( GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? ) | GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GET) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=IntegerPositiveLiteral && LA12_1<=StringLiteral)||LA12_1==IntegerNegativeLiteral) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==108) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==115) ) {
                        alt12=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:7: GET columnFamilyExpr ( 'AS' typeIdentifier )? ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET115=(Token)match(input,GET,FOLLOW_GET_in_getStatement1623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET115);

                    pushFollow(FOLLOW_columnFamilyExpr_in_getStatement1625);
                    columnFamilyExpr116=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr116.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:28: ( 'AS' typeIdentifier )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==107) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:29: 'AS' typeIdentifier
                            {
                            string_literal117=(Token)match(input,107,FOLLOW_107_in_getStatement1628); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_107.add(string_literal117);

                            pushFollow(FOLLOW_typeIdentifier_in_getStatement1630);
                            typeIdentifier118=typeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeIdentifier.add(typeIdentifier118.getTree());

                            }
                            break;

                    }

                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:51: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==LIMIT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:245:52: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal119=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1635); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal119);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: typeIdentifier, limit, columnFamilyExpr
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:9: -> ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:246:12: ^( NODE_THRIFT_GET columnFamilyExpr ( ^( CONVERT_TO_TYPE typeIdentifier ) )? ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:246:47: ( ^( CONVERT_TO_TYPE typeIdentifier ) )?
                        if ( stream_typeIdentifier.hasNext() ) {
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:246:49: ^( CONVERT_TO_TYPE typeIdentifier )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONVERT_TO_TYPE, "CONVERT_TO_TYPE"), root_2);

                            adaptor.addChild(root_2, stream_typeIdentifier.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_typeIdentifier.reset();
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:246:86: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:246:86: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:247:7: GET columnFamily 'WHERE' getCondition ( 'AND' getCondition )* ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    {
                    GET120=(Token)match(input,GET,FOLLOW_GET_in_getStatement1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(GET120);

                    pushFollow(FOLLOW_columnFamily_in_getStatement1686);
                    columnFamily121=columnFamily();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily121.getTree());
                    string_literal122=(Token)match(input,108,FOLLOW_108_in_getStatement1688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal122);

                    pushFollow(FOLLOW_getCondition_in_getStatement1690);
                    getCondition123=getCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_getCondition.add(getCondition123.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:247:45: ( 'AND' getCondition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==AND) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:247:46: 'AND' getCondition
                    	    {
                    	    string_literal124=(Token)match(input,AND,FOLLOW_AND_in_getStatement1693); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(string_literal124);

                    	    pushFollow(FOLLOW_getCondition_in_getStatement1695);
                    	    getCondition125=getCondition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_getCondition.add(getCondition125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:247:67: ( 'LIMIT' limit= IntegerPositiveLiteral )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LIMIT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:247:68: 'LIMIT' limit= IntegerPositiveLiteral
                            {
                            string_literal126=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_getStatement1700); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LIMIT.add(string_literal126);

                            limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_getStatement1704); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: limit, getCondition, columnFamily
                    // token labels: limit
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:9: -> ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:248:12: ^( NODE_THRIFT_GET_WITH_CONDITIONS columnFamily ^( CONDITIONS ( getCondition )+ ) ( ^( NODE_LIMIT $limit) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET_WITH_CONDITIONS, "NODE_THRIFT_GET_WITH_CONDITIONS"), root_1);

                        adaptor.addChild(root_1, stream_columnFamily.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:248:59: ^( CONDITIONS ( getCondition )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);

                        if ( !(stream_getCondition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_getCondition.hasNext() ) {
                            adaptor.addChild(root_2, stream_getCondition.nextTree());

                        }
                        stream_getCondition.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:248:87: ( ^( NODE_LIMIT $limit) )?
                        if ( stream_limit.hasNext() ) {
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:248:87: ^( NODE_LIMIT $limit)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                            adaptor.addChild(root_2, stream_limit.nextNode());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_limit.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStatement"

    public static class getCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getCondition"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:251:1: getCondition : columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) ;
    public final CliParser.getCondition_return getCondition() throws RecognitionException {
        CliParser.getCondition_return retval = new CliParser.getCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.columnOrSuperColumn_return columnOrSuperColumn127 = null;

        CliParser.operator_return operator128 = null;

        CliParser.value_return value129 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:252:5: ( columnOrSuperColumn operator value -> ^( CONDITION operator columnOrSuperColumn value ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:252:7: columnOrSuperColumn operator value
            {
            pushFollow(FOLLOW_columnOrSuperColumn_in_getCondition1755);
            columnOrSuperColumn127=columnOrSuperColumn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(columnOrSuperColumn127.getTree());
            pushFollow(FOLLOW_operator_in_getCondition1757);
            operator128=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator128.getTree());
            pushFollow(FOLLOW_value_in_getCondition1759);
            value129=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value129.getTree());


            // AST REWRITE
            // elements: operator, value, columnOrSuperColumn
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 253:9: -> ^( CONDITION operator columnOrSuperColumn value )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:253:12: ^( CONDITION operator columnOrSuperColumn value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_operator.nextTree());
                adaptor.addChild(root_1, stream_columnOrSuperColumn.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getCondition"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:256:1: operator : ( '=' | '>' | '<' | '>=' | '<=' );
    public final CliParser.operator_return operator() throws RecognitionException {
        CliParser.operator_return retval = new CliParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set130=null;

        CommonTree set130_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:257:5: ( '=' | '>' | '<' | '>=' | '<=' )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set130=(Token)input.LT(1);
            if ( (input.LA(1)>=109 && input.LA(1)<=113) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set130));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:260:1: typeIdentifier : ( Identifier | StringLiteral | IntegerPositiveLiteral );
    public final CliParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CliParser.typeIdentifier_return retval = new CliParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set131=null;

        CommonTree set131_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:261:5: ( Identifier | StringLiteral | IntegerPositiveLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set131=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set131));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class setStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:264:1: setStatement : SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) ;
    public final CliParser.setStatement_return setStatement() throws RecognitionException {
        CliParser.setStatement_return retval = new CliParser.setStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ttlValue=null;
        Token SET132=null;
        Token char_literal134=null;
        Token WITH135=null;
        Token TTL136=null;
        Token char_literal137=null;
        CliParser.value_return objectValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr133 = null;


        CommonTree ttlValue_tree=null;
        CommonTree SET132_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree WITH135_tree=null;
        CommonTree TTL136_tree=null;
        CommonTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleTokenStream stream_TTL=new RewriteRuleTokenStream(adaptor,"token TTL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:265:5: ( SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )? -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:265:7: SET columnFamilyExpr '=' objectValue= value ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            {
            SET132=(Token)match(input,SET,FOLLOW_SET_in_setStatement1855); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET132);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStatement1857);
            columnFamilyExpr133=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr133.getTree());
            char_literal134=(Token)match(input,109,FOLLOW_109_in_setStatement1859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(char_literal134);

            pushFollow(FOLLOW_value_in_setStatement1863);
            objectValue=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(objectValue.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:265:50: ( WITH TTL '=' ttlValue= IntegerPositiveLiteral )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WITH) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:265:51: WITH TTL '=' ttlValue= IntegerPositiveLiteral
                    {
                    WITH135=(Token)match(input,WITH,FOLLOW_WITH_in_setStatement1866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH135);

                    TTL136=(Token)match(input,TTL,FOLLOW_TTL_in_setStatement1868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TTL.add(TTL136);

                    char_literal137=(Token)match(input,109,FOLLOW_109_in_setStatement1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal137);

                    ttlValue=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_setStatement1874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(ttlValue);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ttlValue, columnFamilyExpr, objectValue
            // token labels: ttlValue
            // rule labels: retval, objectValue
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_ttlValue=new RewriteRuleTokenStream(adaptor,"token ttlValue",ttlValue);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_objectValue=new RewriteRuleSubtreeStream(adaptor,"rule objectValue",objectValue!=null?objectValue.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:9: -> ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:266:12: ^( NODE_THRIFT_SET columnFamilyExpr $objectValue ( $ttlValue)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_objectValue.nextTree());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:266:60: ( $ttlValue)?
                if ( stream_ttlValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_ttlValue.nextNode());

                }
                stream_ttlValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStatement"

    public static class incrStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:269:1: incrStatement : ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) );
    public final CliParser.incrStatement_return incrStatement() throws RecognitionException {
        CliParser.incrStatement_return retval = new CliParser.incrStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCR138=null;
        Token BY140=null;
        Token DECR141=null;
        Token BY143=null;
        CliParser.incrementValue_return byValue = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr139 = null;

        CliParser.columnFamilyExpr_return columnFamilyExpr142 = null;


        CommonTree INCR138_tree=null;
        CommonTree BY140_tree=null;
        CommonTree DECR141_tree=null;
        CommonTree BY143_tree=null;
        RewriteRuleTokenStream stream_DECR=new RewriteRuleTokenStream(adaptor,"token DECR");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_INCR=new RewriteRuleTokenStream(adaptor,"token INCR");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_incrementValue=new RewriteRuleSubtreeStream(adaptor,"rule incrementValue");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:270:5: ( INCR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? ) | DECR columnFamilyExpr ( BY byValue= incrementValue )? -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INCR) ) {
                alt16=1;
            }
            else if ( (LA16_0==DECR) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:270:7: INCR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    INCR138=(Token)match(input,INCR,FOLLOW_INCR_in_incrStatement1920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCR.add(INCR138);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement1922);
                    columnFamilyExpr139=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr139.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:270:29: ( BY byValue= incrementValue )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==BY) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:270:30: BY byValue= incrementValue
                            {
                            BY140=(Token)match(input,BY,FOLLOW_BY_in_incrStatement1925); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY140);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement1929);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: columnFamilyExpr, byValue
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:9: -> ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:271:12: ^( NODE_THRIFT_INCR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_INCR, "NODE_THRIFT_INCR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:271:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:272:7: DECR columnFamilyExpr ( BY byValue= incrementValue )?
                    {
                    DECR141=(Token)match(input,DECR,FOLLOW_DECR_in_incrStatement1963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECR.add(DECR141);

                    pushFollow(FOLLOW_columnFamilyExpr_in_incrStatement1965);
                    columnFamilyExpr142=columnFamilyExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr142.getTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:272:29: ( BY byValue= incrementValue )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==BY) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:272:30: BY byValue= incrementValue
                            {
                            BY143=(Token)match(input,BY,FOLLOW_BY_in_incrStatement1968); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BY.add(BY143);

                            pushFollow(FOLLOW_incrementValue_in_incrStatement1972);
                            byValue=incrementValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_incrementValue.add(byValue.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: byValue, columnFamilyExpr
                    // token labels: 
                    // rule labels: retval, byValue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_byValue=new RewriteRuleSubtreeStream(adaptor,"rule byValue",byValue!=null?byValue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 273:9: -> ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                    {
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:273:12: ^( NODE_THRIFT_DECR columnFamilyExpr ( $byValue)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DECR, "NODE_THRIFT_DECR"), root_1);

                        adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                        // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:273:48: ( $byValue)?
                        if ( stream_byValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_byValue.nextTree());

                        }
                        stream_byValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrStatement"

    public static class countStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "countStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:276:1: countStatement : COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) ;
    public final CliParser.countStatement_return countStatement() throws RecognitionException {
        CliParser.countStatement_return retval = new CliParser.countStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COUNT144=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr145 = null;


        CommonTree COUNT144_tree=null;
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:277:5: ( COUNT columnFamilyExpr -> ^( NODE_THRIFT_COUNT columnFamilyExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:277:7: COUNT columnFamilyExpr
            {
            COUNT144=(Token)match(input,COUNT,FOLLOW_COUNT_in_countStatement2015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT144);

            pushFollow(FOLLOW_columnFamilyExpr_in_countStatement2017);
            columnFamilyExpr145=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr145.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:9: -> ^( NODE_THRIFT_COUNT columnFamilyExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:278:12: ^( NODE_THRIFT_COUNT columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_COUNT, "NODE_THRIFT_COUNT"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "countStatement"

    public static class delStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:281:1: delStatement : DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) ;
    public final CliParser.delStatement_return delStatement() throws RecognitionException {
        CliParser.delStatement_return retval = new CliParser.delStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEL146=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr147 = null;


        CommonTree DEL146_tree=null;
        RewriteRuleTokenStream stream_DEL=new RewriteRuleTokenStream(adaptor,"token DEL");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:282:5: ( DEL columnFamilyExpr -> ^( NODE_THRIFT_DEL columnFamilyExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:282:7: DEL columnFamilyExpr
            {
            DEL146=(Token)match(input,DEL,FOLLOW_DEL_in_delStatement2051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEL.add(DEL146);

            pushFollow(FOLLOW_columnFamilyExpr_in_delStatement2053);
            columnFamilyExpr147=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr147.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 283:9: -> ^( NODE_THRIFT_DEL columnFamilyExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:283:12: ^( NODE_THRIFT_DEL columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_DEL, "NODE_THRIFT_DEL"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delStatement"

    public static class showStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:286:1: showStatement : ( showClusterName | showVersion | showKeyspaces | showSchema );
    public final CliParser.showStatement_return showStatement() throws RecognitionException {
        CliParser.showStatement_return retval = new CliParser.showStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName148 = null;

        CliParser.showVersion_return showVersion149 = null;

        CliParser.showKeyspaces_return showKeyspaces150 = null;

        CliParser.showSchema_return showSchema151 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:287:5: ( showClusterName | showVersion | showKeyspaces | showSchema )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SHOW) ) {
                switch ( input.LA(2) ) {
                case 105:
                    {
                    alt17=1;
                    }
                    break;
                case API_VERSION:
                    {
                    alt17=2;
                    }
                    break;
                case KEYSPACES:
                    {
                    alt17=3;
                    }
                    break;
                case SCHEMA:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:287:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStatement2087);
                    showClusterName148=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName148.getTree());

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:288:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStatement2095);
                    showVersion149=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion149.getTree());

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:289:7: showKeyspaces
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showKeyspaces_in_showStatement2103);
                    showKeyspaces150=showKeyspaces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showKeyspaces150.getTree());

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:290:7: showSchema
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showSchema_in_showStatement2111);
                    showSchema151=showSchema();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showSchema151.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStatement"

    public static class listStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:293:1: listStatement : LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) ;
    public final CliParser.listStatement_return listStatement() throws RecognitionException {
        CliParser.listStatement_return retval = new CliParser.listStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token limit=null;
        Token LIST152=null;
        Token string_literal155=null;
        CliParser.columnFamily_return columnFamily153 = null;

        CliParser.keyRangeExpr_return keyRangeExpr154 = null;


        CommonTree limit_tree=null;
        CommonTree LIST152_tree=null;
        CommonTree string_literal155_tree=null;
        RewriteRuleTokenStream stream_IntegerPositiveLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerPositiveLiteral");
        RewriteRuleTokenStream stream_LIST=new RewriteRuleTokenStream(adaptor,"token LIST");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_keyRangeExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyRangeExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:294:5: ( LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerPositiveLiteral )? -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:294:7: LIST columnFamily ( keyRangeExpr )? ( 'LIMIT' limit= IntegerPositiveLiteral )?
            {
            LIST152=(Token)match(input,LIST,FOLLOW_LIST_in_listStatement2128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIST.add(LIST152);

            pushFollow(FOLLOW_columnFamily_in_listStatement2130);
            columnFamily153=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily153.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:294:25: ( keyRangeExpr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==115) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: keyRangeExpr
                    {
                    pushFollow(FOLLOW_keyRangeExpr_in_listStatement2132);
                    keyRangeExpr154=keyRangeExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyRangeExpr.add(keyRangeExpr154.getTree());

                    }
                    break;

            }

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:294:39: ( 'LIMIT' limit= IntegerPositiveLiteral )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LIMIT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:294:40: 'LIMIT' limit= IntegerPositiveLiteral
                    {
                    string_literal155=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_listStatement2136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(string_literal155);

                    limit=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_listStatement2140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IntegerPositiveLiteral.add(limit);


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, columnFamily, keyRangeExpr
            // token labels: limit
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:9: -> ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:295:12: ^( NODE_LIST columnFamily ( keyRangeExpr )? ( ^( NODE_LIMIT $limit) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIST, "NODE_LIST"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:295:37: ( keyRangeExpr )?
                if ( stream_keyRangeExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyRangeExpr.nextTree());

                }
                stream_keyRangeExpr.reset();
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:295:51: ( ^( NODE_LIMIT $limit) )?
                if ( stream_limit.hasNext() ) {
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:295:51: ^( NODE_LIMIT $limit)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_LIMIT, "NODE_LIMIT"), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listStatement"

    public static class truncateStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "truncateStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:298:1: truncateStatement : TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) ;
    public final CliParser.truncateStatement_return truncateStatement() throws RecognitionException {
        CliParser.truncateStatement_return retval = new CliParser.truncateStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUNCATE156=null;
        CliParser.columnFamily_return columnFamily157 = null;


        CommonTree TRUNCATE156_tree=null;
        RewriteRuleTokenStream stream_TRUNCATE=new RewriteRuleTokenStream(adaptor,"token TRUNCATE");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:299:5: ( TRUNCATE columnFamily -> ^( NODE_TRUNCATE columnFamily ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:299:7: TRUNCATE columnFamily
            {
            TRUNCATE156=(Token)match(input,TRUNCATE,FOLLOW_TRUNCATE_in_truncateStatement2186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRUNCATE.add(TRUNCATE156);

            pushFollow(FOLLOW_columnFamily_in_truncateStatement2188);
            columnFamily157=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily157.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 300:9: -> ^( NODE_TRUNCATE columnFamily )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:300:12: ^( NODE_TRUNCATE columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_TRUNCATE, "NODE_TRUNCATE"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "truncateStatement"

    public static class assumeStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assumeStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:303:1: assumeStatement : ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) ;
    public final CliParser.assumeStatement_return assumeStatement() throws RecognitionException {
        CliParser.assumeStatement_return retval = new CliParser.assumeStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token assumptionElement=null;
        Token defaultType=null;
        Token ASSUME158=null;
        Token string_literal160=null;
        CliParser.columnFamily_return columnFamily159 = null;


        CommonTree assumptionElement_tree=null;
        CommonTree defaultType_tree=null;
        CommonTree ASSUME158_tree=null;
        CommonTree string_literal160_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_ASSUME=new RewriteRuleTokenStream(adaptor,"token ASSUME");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:304:5: ( ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:304:7: ASSUME columnFamily assumptionElement= Identifier 'AS' defaultType= Identifier
            {
            ASSUME158=(Token)match(input,ASSUME,FOLLOW_ASSUME_in_assumeStatement2221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSUME.add(ASSUME158);

            pushFollow(FOLLOW_columnFamily_in_assumeStatement2223);
            columnFamily159=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily159.getTree());
            assumptionElement=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement2227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(assumptionElement);

            string_literal160=(Token)match(input,107,FOLLOW_107_in_assumeStatement2229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal160);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_assumeStatement2233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType, columnFamily, assumptionElement
            // token labels: defaultType, assumptionElement
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleTokenStream stream_assumptionElement=new RewriteRuleTokenStream(adaptor,"token assumptionElement",assumptionElement);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:9: -> ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:305:12: ^( NODE_ASSUME columnFamily $assumptionElement $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ASSUME, "NODE_ASSUME"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_assumptionElement.nextNode());
                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assumeStatement"

    public static class consistencyLevelStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consistencyLevelStatement"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:308:1: consistencyLevelStatement : CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) ;
    public final CliParser.consistencyLevelStatement_return consistencyLevelStatement() throws RecognitionException {
        CliParser.consistencyLevelStatement_return retval = new CliParser.consistencyLevelStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token defaultType=null;
        Token CONSISTENCYLEVEL161=null;
        Token string_literal162=null;

        CommonTree defaultType_tree=null;
        CommonTree CONSISTENCYLEVEL161_tree=null;
        CommonTree string_literal162_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_CONSISTENCYLEVEL=new RewriteRuleTokenStream(adaptor,"token CONSISTENCYLEVEL");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:309:5: ( CONSISTENCYLEVEL 'AS' defaultType= Identifier -> ^( NODE_CONSISTENCY_LEVEL $defaultType) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:309:7: CONSISTENCYLEVEL 'AS' defaultType= Identifier
            {
            CONSISTENCYLEVEL161=(Token)match(input,CONSISTENCYLEVEL,FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONSISTENCYLEVEL.add(CONSISTENCYLEVEL161);

            string_literal162=(Token)match(input,107,FOLLOW_107_in_consistencyLevelStatement2274); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal162);

            defaultType=(Token)match(input,Identifier,FOLLOW_Identifier_in_consistencyLevelStatement2278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(defaultType);



            // AST REWRITE
            // elements: defaultType
            // token labels: defaultType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_defaultType=new RewriteRuleTokenStream(adaptor,"token defaultType",defaultType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 310:9: -> ^( NODE_CONSISTENCY_LEVEL $defaultType)
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:310:12: ^( NODE_CONSISTENCY_LEVEL $defaultType)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONSISTENCY_LEVEL, "NODE_CONSISTENCY_LEVEL"), root_1);

                adaptor.addChild(root_1, stream_defaultType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consistencyLevelStatement"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:313:1: showClusterName : SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW163=null;
        Token string_literal164=null;

        CommonTree SHOW163_tree=null;
        CommonTree string_literal164_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:314:5: ( SHOW 'CLUSTER NAME' -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:314:7: SHOW 'CLUSTER NAME'
            {
            SHOW163=(Token)match(input,SHOW,FOLLOW_SHOW_in_showClusterName2312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW163);

            string_literal164=(Token)match(input,105,FOLLOW_105_in_showClusterName2314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(string_literal164);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 315:9: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:315:12: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class addKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addKeyspace"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:318:1: addKeyspace : CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.addKeyspace_return addKeyspace() throws RecognitionException {
        CliParser.addKeyspace_return retval = new CliParser.addKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE165=null;
        Token KEYSPACE166=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr167 = null;


        CommonTree CREATE165_tree=null;
        CommonTree KEYSPACE166_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:319:5: ( CREATE KEYSPACE keyValuePairExpr -> ^( NODE_ADD_KEYSPACE keyValuePairExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:319:7: CREATE KEYSPACE keyValuePairExpr
            {
            CREATE165=(Token)match(input,CREATE,FOLLOW_CREATE_in_addKeyspace2345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE165);

            KEYSPACE166=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_addKeyspace2347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE166);

            pushFollow(FOLLOW_keyValuePairExpr_in_addKeyspace2349);
            keyValuePairExpr167=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr167.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 320:9: -> ^( NODE_ADD_KEYSPACE keyValuePairExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:320:12: ^( NODE_ADD_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_KEYSPACE, "NODE_ADD_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addKeyspace"

    public static class addColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addColumnFamily"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:323:1: addColumnFamily : CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.addColumnFamily_return addColumnFamily() throws RecognitionException {
        CliParser.addColumnFamily_return retval = new CliParser.addColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE168=null;
        Token COLUMN169=null;
        Token FAMILY170=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr171 = null;


        CommonTree CREATE168_tree=null;
        CommonTree COLUMN169_tree=null;
        CommonTree FAMILY170_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:324:5: ( CREATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:324:7: CREATE COLUMN FAMILY keyValuePairExpr
            {
            CREATE168=(Token)match(input,CREATE,FOLLOW_CREATE_in_addColumnFamily2383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE168);

            COLUMN169=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_addColumnFamily2385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN169);

            FAMILY170=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_addColumnFamily2387); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY170);

            pushFollow(FOLLOW_keyValuePairExpr_in_addColumnFamily2389);
            keyValuePairExpr171=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr171.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 325:9: -> ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:325:12: ^( NODE_ADD_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ADD_COLUMN_FAMILY, "NODE_ADD_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addColumnFamily"

    public static class updateKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateKeyspace"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:328:1: updateKeyspace : UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) ;
    public final CliParser.updateKeyspace_return updateKeyspace() throws RecognitionException {
        CliParser.updateKeyspace_return retval = new CliParser.updateKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE172=null;
        Token KEYSPACE173=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr174 = null;


        CommonTree UPDATE172_tree=null;
        CommonTree KEYSPACE173_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:329:5: ( UPDATE KEYSPACE keyValuePairExpr -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:329:7: UPDATE KEYSPACE keyValuePairExpr
            {
            UPDATE172=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateKeyspace2423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE172);

            KEYSPACE173=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_updateKeyspace2425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE173);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateKeyspace2427);
            keyValuePairExpr174=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr174.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 330:9: -> ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:330:12: ^( NODE_UPDATE_KEYSPACE keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_KEYSPACE, "NODE_UPDATE_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateKeyspace"

    public static class updateColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "updateColumnFamily"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:333:1: updateColumnFamily : UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) ;
    public final CliParser.updateColumnFamily_return updateColumnFamily() throws RecognitionException {
        CliParser.updateColumnFamily_return retval = new CliParser.updateColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPDATE175=null;
        Token COLUMN176=null;
        Token FAMILY177=null;
        CliParser.keyValuePairExpr_return keyValuePairExpr178 = null;


        CommonTree UPDATE175_tree=null;
        CommonTree COLUMN176_tree=null;
        CommonTree FAMILY177_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_keyValuePairExpr=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePairExpr");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:334:5: ( UPDATE COLUMN FAMILY keyValuePairExpr -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:334:7: UPDATE COLUMN FAMILY keyValuePairExpr
            {
            UPDATE175=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_updateColumnFamily2460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE175);

            COLUMN176=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_updateColumnFamily2462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN176);

            FAMILY177=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_updateColumnFamily2464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY177);

            pushFollow(FOLLOW_keyValuePairExpr_in_updateColumnFamily2466);
            keyValuePairExpr178=keyValuePairExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyValuePairExpr.add(keyValuePairExpr178.getTree());


            // AST REWRITE
            // elements: keyValuePairExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 335:9: -> ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:335:12: ^( NODE_UPDATE_COLUMN_FAMILY keyValuePairExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_UPDATE_COLUMN_FAMILY, "NODE_UPDATE_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_keyValuePairExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "updateColumnFamily"

    public static class delKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delKeyspace"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:338:1: delKeyspace : DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) ;
    public final CliParser.delKeyspace_return delKeyspace() throws RecognitionException {
        CliParser.delKeyspace_return retval = new CliParser.delKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP179=null;
        Token KEYSPACE180=null;
        CliParser.keyspace_return keyspace181 = null;


        CommonTree DROP179_tree=null;
        CommonTree KEYSPACE180_tree=null;
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:339:5: ( DROP KEYSPACE keyspace -> ^( NODE_DEL_KEYSPACE keyspace ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:339:7: DROP KEYSPACE keyspace
            {
            DROP179=(Token)match(input,DROP,FOLLOW_DROP_in_delKeyspace2499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP179);

            KEYSPACE180=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_delKeyspace2501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE180);

            pushFollow(FOLLOW_keyspace_in_delKeyspace2503);
            keyspace181=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace181.getTree());


            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:9: -> ^( NODE_DEL_KEYSPACE keyspace )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:340:12: ^( NODE_DEL_KEYSPACE keyspace )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_KEYSPACE, "NODE_DEL_KEYSPACE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delKeyspace"

    public static class delColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delColumnFamily"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:343:1: delColumnFamily : DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) ;
    public final CliParser.delColumnFamily_return delColumnFamily() throws RecognitionException {
        CliParser.delColumnFamily_return retval = new CliParser.delColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP182=null;
        Token COLUMN183=null;
        Token FAMILY184=null;
        CliParser.columnFamily_return columnFamily185 = null;


        CommonTree DROP182_tree=null;
        CommonTree COLUMN183_tree=null;
        CommonTree FAMILY184_tree=null;
        RewriteRuleTokenStream stream_FAMILY=new RewriteRuleTokenStream(adaptor,"token FAMILY");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_COLUMN=new RewriteRuleTokenStream(adaptor,"token COLUMN");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:344:5: ( DROP COLUMN FAMILY columnFamily -> ^( NODE_DEL_COLUMN_FAMILY columnFamily ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:344:7: DROP COLUMN FAMILY columnFamily
            {
            DROP182=(Token)match(input,DROP,FOLLOW_DROP_in_delColumnFamily2537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP182);

            COLUMN183=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_delColumnFamily2539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLUMN.add(COLUMN183);

            FAMILY184=(Token)match(input,FAMILY,FOLLOW_FAMILY_in_delColumnFamily2541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FAMILY.add(FAMILY184);

            pushFollow(FOLLOW_columnFamily_in_delColumnFamily2543);
            columnFamily185=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily185.getTree());


            // AST REWRITE
            // elements: columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 345:9: -> ^( NODE_DEL_COLUMN_FAMILY columnFamily )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:345:12: ^( NODE_DEL_COLUMN_FAMILY columnFamily )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DEL_COLUMN_FAMILY, "NODE_DEL_COLUMN_FAMILY"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delColumnFamily"

    public static class dropIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dropIndex"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:348:1: dropIndex : DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) ;
    public final CliParser.dropIndex_return dropIndex() throws RecognitionException {
        CliParser.dropIndex_return retval = new CliParser.dropIndex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DROP186=null;
        Token INDEX187=null;
        Token ON188=null;
        Token char_literal190=null;
        CliParser.columnFamily_return columnFamily189 = null;

        CliParser.columnName_return columnName191 = null;


        CommonTree DROP186_tree=null;
        CommonTree INDEX187_tree=null;
        CommonTree ON188_tree=null;
        CommonTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_columnName=new RewriteRuleSubtreeStream(adaptor,"rule columnName");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:349:5: ( DROP INDEX ON columnFamily '.' columnName -> ^( NODE_DROP_INDEX columnFamily columnName ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:349:7: DROP INDEX ON columnFamily '.' columnName
            {
            DROP186=(Token)match(input,DROP,FOLLOW_DROP_in_dropIndex2577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP186);

            INDEX187=(Token)match(input,INDEX,FOLLOW_INDEX_in_dropIndex2579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEX.add(INDEX187);

            ON188=(Token)match(input,ON,FOLLOW_ON_in_dropIndex2581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ON.add(ON188);

            pushFollow(FOLLOW_columnFamily_in_dropIndex2583);
            columnFamily189=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily189.getTree());
            char_literal190=(Token)match(input,114,FOLLOW_114_in_dropIndex2585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_114.add(char_literal190);

            pushFollow(FOLLOW_columnName_in_dropIndex2587);
            columnName191=columnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnName.add(columnName191.getTree());


            // AST REWRITE
            // elements: columnName, columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 350:9: -> ^( NODE_DROP_INDEX columnFamily columnName )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:350:12: ^( NODE_DROP_INDEX columnFamily columnName )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DROP_INDEX, "NODE_DROP_INDEX"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_columnName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dropIndex"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:353:1: showVersion : SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW192=null;
        Token API_VERSION193=null;

        CommonTree SHOW192_tree=null;
        CommonTree API_VERSION193_tree=null;
        RewriteRuleTokenStream stream_API_VERSION=new RewriteRuleTokenStream(adaptor,"token API_VERSION");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:354:5: ( SHOW API_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:354:7: SHOW API_VERSION
            {
            SHOW192=(Token)match(input,SHOW,FOLLOW_SHOW_in_showVersion2622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW192);

            API_VERSION193=(Token)match(input,API_VERSION,FOLLOW_API_VERSION_in_showVersion2624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_API_VERSION.add(API_VERSION193);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:9: -> ^( NODE_SHOW_VERSION )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:355:12: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showKeyspaces_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showKeyspaces"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:358:1: showKeyspaces : SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) ;
    public final CliParser.showKeyspaces_return showKeyspaces() throws RecognitionException {
        CliParser.showKeyspaces_return retval = new CliParser.showKeyspaces_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW194=null;
        Token KEYSPACES195=null;

        CommonTree SHOW194_tree=null;
        CommonTree KEYSPACES195_tree=null;
        RewriteRuleTokenStream stream_KEYSPACES=new RewriteRuleTokenStream(adaptor,"token KEYSPACES");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:359:5: ( SHOW KEYSPACES -> ^( NODE_SHOW_KEYSPACES ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:359:7: SHOW KEYSPACES
            {
            SHOW194=(Token)match(input,SHOW,FOLLOW_SHOW_in_showKeyspaces2655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW194);

            KEYSPACES195=(Token)match(input,KEYSPACES,FOLLOW_KEYSPACES_in_showKeyspaces2657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACES.add(KEYSPACES195);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 360:9: -> ^( NODE_SHOW_KEYSPACES )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:360:12: ^( NODE_SHOW_KEYSPACES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_KEYSPACES, "NODE_SHOW_KEYSPACES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showKeyspaces"

    public static class showSchema_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showSchema"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:363:1: showSchema : SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) ;
    public final CliParser.showSchema_return showSchema() throws RecognitionException {
        CliParser.showSchema_return retval = new CliParser.showSchema_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHOW196=null;
        Token SCHEMA197=null;
        CliParser.keyspace_return keyspace198 = null;


        CommonTree SHOW196_tree=null;
        CommonTree SCHEMA197_tree=null;
        RewriteRuleTokenStream stream_SCHEMA=new RewriteRuleTokenStream(adaptor,"token SCHEMA");
        RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:364:5: ( SHOW SCHEMA ( keyspace )? -> ^( NODE_SHOW_SCHEMA ( keyspace )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:364:7: SHOW SCHEMA ( keyspace )?
            {
            SHOW196=(Token)match(input,SHOW,FOLLOW_SHOW_in_showSchema2689); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SHOW.add(SHOW196);

            SCHEMA197=(Token)match(input,SCHEMA,FOLLOW_SCHEMA_in_showSchema2691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCHEMA.add(SCHEMA197);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:364:19: ( keyspace )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=IntegerPositiveLiteral && LA20_0<=StringLiteral)||LA20_0==IntegerNegativeLiteral) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:364:20: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_showSchema2694);
                    keyspace198=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace198.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 365:9: -> ^( NODE_SHOW_SCHEMA ( keyspace )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:365:12: ^( NODE_SHOW_SCHEMA ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_SCHEMA, "NODE_SHOW_SCHEMA"), root_1);

                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:365:31: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showSchema"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:368:1: describeTable : DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE199=null;
        Token KEYSPACE200=null;
        CliParser.keyspace_return keyspace201 = null;


        CommonTree DESCRIBE199_tree=null;
        CommonTree KEYSPACE200_tree=null;
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleTokenStream stream_KEYSPACE=new RewriteRuleTokenStream(adaptor,"token KEYSPACE");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:369:5: ( DESCRIBE KEYSPACE ( keyspace )? -> ^( NODE_DESCRIBE_TABLE ( keyspace )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:369:7: DESCRIBE KEYSPACE ( keyspace )?
            {
            DESCRIBE199=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeTable2732); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE199);

            KEYSPACE200=(Token)match(input,KEYSPACE,FOLLOW_KEYSPACE_in_describeTable2734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEYSPACE.add(KEYSPACE200);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:369:25: ( keyspace )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=IntegerPositiveLiteral && LA21_0<=StringLiteral)||LA21_0==IntegerNegativeLiteral) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:369:26: keyspace
                    {
                    pushFollow(FOLLOW_keyspace_in_describeTable2737);
                    keyspace201=keyspace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keyspace.add(keyspace201.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 370:9: -> ^( NODE_DESCRIBE_TABLE ( keyspace )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:370:12: ^( NODE_DESCRIBE_TABLE ( keyspace )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:370:34: ( keyspace )?
                if ( stream_keyspace.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyspace.nextTree());

                }
                stream_keyspace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class describeCluster_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeCluster"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:373:1: describeCluster : DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) ;
    public final CliParser.describeCluster_return describeCluster() throws RecognitionException {
        CliParser.describeCluster_return retval = new CliParser.describeCluster_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESCRIBE202=null;
        Token string_literal203=null;

        CommonTree DESCRIBE202_tree=null;
        CommonTree string_literal203_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:374:5: ( DESCRIBE 'CLUSTER' -> ^( NODE_DESCRIBE_CLUSTER ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:374:7: DESCRIBE 'CLUSTER'
            {
            DESCRIBE202=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeCluster2779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESCRIBE.add(DESCRIBE202);

            string_literal203=(Token)match(input,104,FOLLOW_104_in_describeCluster2781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(string_literal203);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 375:9: -> ^( NODE_DESCRIBE_CLUSTER )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:375:12: ^( NODE_DESCRIBE_CLUSTER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_CLUSTER, "NODE_DESCRIBE_CLUSTER"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeCluster"

    public static class useKeyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useKeyspace"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:378:1: useKeyspace : USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) ;
    public final CliParser.useKeyspace_return useKeyspace() throws RecognitionException {
        CliParser.useKeyspace_return retval = new CliParser.useKeyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USE204=null;
        CliParser.keyspace_return keyspace205 = null;

        CliParser.username_return username206 = null;

        CliParser.password_return password207 = null;


        CommonTree USE204_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleSubtreeStream stream_username=new RewriteRuleSubtreeStream(adaptor,"rule username");
        RewriteRuleSubtreeStream stream_keyspace=new RewriteRuleSubtreeStream(adaptor,"rule keyspace");
        RewriteRuleSubtreeStream stream_password=new RewriteRuleSubtreeStream(adaptor,"rule password");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:5: ( USE keyspace ( username )? ( password )? -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:7: USE keyspace ( username )? ( password )?
            {
            USE204=(Token)match(input,USE,FOLLOW_USE_in_useKeyspace2812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_USE.add(USE204);

            pushFollow(FOLLOW_keyspace_in_useKeyspace2814);
            keyspace205=keyspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_keyspace.add(keyspace205.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:20: ( username )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:22: username
                    {
                    pushFollow(FOLLOW_username_in_useKeyspace2818);
                    username206=username();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_username.add(username206.getTree());

                    }
                    break;

            }

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:34: ( password )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==StringLiteral) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:379:36: password
                    {
                    pushFollow(FOLLOW_password_in_useKeyspace2825);
                    password207=password();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_password.add(password207.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: password, username, keyspace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 380:9: -> ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:380:12: ^( NODE_USE_TABLE keyspace ( username )? ( password )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_USE_TABLE, "NODE_USE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_keyspace.nextTree());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:380:38: ( username )?
                if ( stream_username.hasNext() ) {
                    adaptor.addChild(root_1, stream_username.nextTree());

                }
                stream_username.reset();
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:380:52: ( password )?
                if ( stream_password.hasNext() ) {
                    adaptor.addChild(root_1, stream_password.nextTree());

                }
                stream_password.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "useKeyspace"

    public static class keyValuePairExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePairExpr"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:384:1: keyValuePairExpr : entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) ;
    public final CliParser.keyValuePairExpr_return keyValuePairExpr() throws RecognitionException {
        CliParser.keyValuePairExpr_return retval = new CliParser.keyValuePairExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND209=null;
        Token WITH210=null;
        CliParser.entityName_return entityName208 = null;

        CliParser.keyValuePair_return keyValuePair211 = null;


        CommonTree AND209_tree=null;
        CommonTree WITH210_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_keyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule keyValuePair");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:5: ( entityName ( ( AND | WITH ) keyValuePair )* -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:7: entityName ( ( AND | WITH ) keyValuePair )*
            {
            pushFollow(FOLLOW_entityName_in_keyValuePairExpr2877);
            entityName208=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_entityName.add(entityName208.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:18: ( ( AND | WITH ) keyValuePair )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==WITH||LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:20: ( AND | WITH ) keyValuePair
            	    {
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:20: ( AND | WITH )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==AND) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==WITH) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:21: AND
            	            {
            	            AND209=(Token)match(input,AND,FOLLOW_AND_in_keyValuePairExpr2882); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_AND.add(AND209);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:385:27: WITH
            	            {
            	            WITH210=(Token)match(input,WITH,FOLLOW_WITH_in_keyValuePairExpr2886); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_WITH.add(WITH210);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_keyValuePair_in_keyValuePairExpr2889);
            	    keyValuePair211=keyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_keyValuePair.add(keyValuePair211.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: keyValuePair, entityName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 386:9: -> ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:386:12: ^( NODE_NEW_KEYSPACE_ACCESS entityName ( keyValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NEW_KEYSPACE_ACCESS, "NODE_NEW_KEYSPACE_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_entityName.nextTree());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:386:50: ( keyValuePair )*
                while ( stream_keyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_keyValuePair.nextTree());

                }
                stream_keyValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePairExpr"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:389:1: keyValuePair : attr_name '=' attrValue -> attr_name attrValue ;
    public final CliParser.keyValuePair_return keyValuePair() throws RecognitionException {
        CliParser.keyValuePair_return retval = new CliParser.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal213=null;
        CliParser.attr_name_return attr_name212 = null;

        CliParser.attrValue_return attrValue214 = null;


        CommonTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_attr_name=new RewriteRuleSubtreeStream(adaptor,"rule attr_name");
        RewriteRuleSubtreeStream stream_attrValue=new RewriteRuleSubtreeStream(adaptor,"rule attrValue");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:390:5: ( attr_name '=' attrValue -> attr_name attrValue )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:390:7: attr_name '=' attrValue
            {
            pushFollow(FOLLOW_attr_name_in_keyValuePair2946);
            attr_name212=attr_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attr_name.add(attr_name212.getTree());
            char_literal213=(Token)match(input,109,FOLLOW_109_in_keyValuePair2948); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(char_literal213);

            pushFollow(FOLLOW_attrValue_in_keyValuePair2950);
            attrValue214=attrValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_attrValue.add(attrValue214.getTree());


            // AST REWRITE
            // elements: attrValue, attr_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 391:6: -> attr_name attrValue
            {
                adaptor.addChild(root_0, stream_attr_name.nextTree());
                adaptor.addChild(root_0, stream_attrValue.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class attrValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:394:1: attrValue : ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble );
    public final CliParser.attrValue_return attrValue() throws RecognitionException {
        CliParser.attrValue_return retval = new CliParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.arrayConstruct_return arrayConstruct215 = null;

        CliParser.attrValueString_return attrValueString216 = null;

        CliParser.attrValueInt_return attrValueInt217 = null;

        CliParser.attrValueDouble_return attrValueDouble218 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:395:5: ( arrayConstruct | attrValueString | attrValueInt | attrValueDouble )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt26=1;
                }
                break;
            case Identifier:
            case StringLiteral:
                {
                alt26=2;
                }
                break;
            case IntegerPositiveLiteral:
            case IntegerNegativeLiteral:
                {
                alt26=3;
                }
                break;
            case DoubleLiteral:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:395:7: arrayConstruct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayConstruct_in_attrValue2979);
                    arrayConstruct215=arrayConstruct();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayConstruct215.getTree());

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:396:7: attrValueString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueString_in_attrValue2987);
                    attrValueString216=attrValueString();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueString216.getTree());

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:397:7: attrValueInt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueInt_in_attrValue2995);
                    attrValueInt217=attrValueInt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueInt217.getTree());

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:398:7: attrValueDouble
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_attrValueDouble_in_attrValue3003);
                    attrValueDouble218=attrValueDouble();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValueDouble218.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class arrayConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayConstruct"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:402:1: arrayConstruct : '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) ;
    public final CliParser.arrayConstruct_return arrayConstruct() throws RecognitionException {
        CliParser.arrayConstruct_return retval = new CliParser.arrayConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal219=null;
        Token char_literal221=null;
        Token char_literal222=null;
        CliParser.hashConstruct_return hashConstruct220 = null;


        CommonTree char_literal219_tree=null;
        CommonTree char_literal221_tree=null;
        CommonTree char_literal222_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_hashConstruct=new RewriteRuleSubtreeStream(adaptor,"rule hashConstruct");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:403:5: ( '[' ( hashConstruct ( ',' )? )+ ']' -> ^( ARRAY ( hashConstruct )+ ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:403:7: '[' ( hashConstruct ( ',' )? )+ ']'
            {
            char_literal219=(Token)match(input,115,FOLLOW_115_in_arrayConstruct3022); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(char_literal219);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:403:11: ( hashConstruct ( ',' )? )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==118) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:403:12: hashConstruct ( ',' )?
            	    {
            	    pushFollow(FOLLOW_hashConstruct_in_arrayConstruct3025);
            	    hashConstruct220=hashConstruct();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashConstruct.add(hashConstruct220.getTree());
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:403:26: ( ',' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==116) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: ','
            	            {
            	            char_literal221=(Token)match(input,116,FOLLOW_116_in_arrayConstruct3027); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_116.add(char_literal221);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            char_literal222=(Token)match(input,117,FOLLOW_117_in_arrayConstruct3032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal222);



            // AST REWRITE
            // elements: hashConstruct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 404:9: -> ^( ARRAY ( hashConstruct )+ )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:404:12: ^( ARRAY ( hashConstruct )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                if ( !(stream_hashConstruct.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashConstruct.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashConstruct.nextTree());

                }
                stream_hashConstruct.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayConstruct"

    public static class hashConstruct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashConstruct"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:407:1: hashConstruct : '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) ;
    public final CliParser.hashConstruct_return hashConstruct() throws RecognitionException {
        CliParser.hashConstruct_return retval = new CliParser.hashConstruct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal223=null;
        Token char_literal225=null;
        Token char_literal227=null;
        CliParser.hashElementPair_return hashElementPair224 = null;

        CliParser.hashElementPair_return hashElementPair226 = null;


        CommonTree char_literal223_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal227_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_hashElementPair=new RewriteRuleSubtreeStream(adaptor,"rule hashElementPair");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:408:5: ( '{' hashElementPair ( ',' hashElementPair )* '}' -> ^( HASH ( hashElementPair )+ ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:408:7: '{' hashElementPair ( ',' hashElementPair )* '}'
            {
            char_literal223=(Token)match(input,118,FOLLOW_118_in_hashConstruct3070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(char_literal223);

            pushFollow(FOLLOW_hashElementPair_in_hashConstruct3072);
            hashElementPair224=hashElementPair();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair224.getTree());
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:408:27: ( ',' hashElementPair )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==116) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:408:28: ',' hashElementPair
            	    {
            	    char_literal225=(Token)match(input,116,FOLLOW_116_in_hashConstruct3075); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_116.add(char_literal225);

            	    pushFollow(FOLLOW_hashElementPair_in_hashConstruct3077);
            	    hashElementPair226=hashElementPair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hashElementPair.add(hashElementPair226.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            char_literal227=(Token)match(input,119,FOLLOW_119_in_hashConstruct3081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal227);



            // AST REWRITE
            // elements: hashElementPair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 409:9: -> ^( HASH ( hashElementPair )+ )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:409:12: ^( HASH ( hashElementPair )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(HASH, "HASH"), root_1);

                if ( !(stream_hashElementPair.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hashElementPair.hasNext() ) {
                    adaptor.addChild(root_1, stream_hashElementPair.nextTree());

                }
                stream_hashElementPair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashConstruct"

    public static class hashElementPair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashElementPair"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:412:1: hashElementPair : rowKey ':' value -> ^( PAIR rowKey value ) ;
    public final CliParser.hashElementPair_return hashElementPair() throws RecognitionException {
        CliParser.hashElementPair_return retval = new CliParser.hashElementPair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal229=null;
        CliParser.rowKey_return rowKey228 = null;

        CliParser.value_return value230 = null;


        CommonTree char_literal229_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:413:5: ( rowKey ':' value -> ^( PAIR rowKey value ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:413:7: rowKey ':' value
            {
            pushFollow(FOLLOW_rowKey_in_hashElementPair3117);
            rowKey228=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey228.getTree());
            char_literal229=(Token)match(input,120,FOLLOW_120_in_hashElementPair3119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(char_literal229);

            pushFollow(FOLLOW_value_in_hashElementPair3121);
            value230=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value230.getTree());


            // AST REWRITE
            // elements: value, rowKey
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 414:9: -> ^( PAIR rowKey value )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:414:12: ^( PAIR rowKey value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_rowKey.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hashElementPair"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:417:1: columnFamilyExpr : columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal232=null;
        Token char_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        CliParser.columnOrSuperColumn_return column = null;

        CliParser.columnOrSuperColumn_return super_column = null;

        CliParser.columnFamily_return columnFamily231 = null;

        CliParser.rowKey_return rowKey233 = null;


        CommonTree char_literal232_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:418:5: ( columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:418:7: columnFamily '[' rowKey ']' ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr3156);
            columnFamily231=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily231.getTree());
            char_literal232=(Token)match(input,115,FOLLOW_115_in_columnFamilyExpr3158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(char_literal232);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr3160);
            rowKey233=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey233.getTree());
            char_literal234=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal234);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:419:9: ( '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==115) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:419:11: '[' column= columnOrSuperColumn ']' ( '[' super_column= columnOrSuperColumn ']' )?
                    {
                    char_literal235=(Token)match(input,115,FOLLOW_115_in_columnFamilyExpr3175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal235);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3179);
                    column=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(column.getTree());
                    char_literal236=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(char_literal236);

                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:420:13: ( '[' super_column= columnOrSuperColumn ']' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==115) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:420:14: '[' super_column= columnOrSuperColumn ']'
                            {
                            char_literal237=(Token)match(input,115,FOLLOW_115_in_columnFamilyExpr3197); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_115.add(char_literal237);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3201);
                            super_column=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(super_column.getTree());
                            char_literal238=(Token)match(input,117,FOLLOW_117_in_columnFamilyExpr3203); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_117.add(char_literal238);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: super_column, rowKey, column, columnFamily
            // token labels: 
            // rule labels: retval, column, super_column
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column",column!=null?column.tree:null);
            RewriteRuleSubtreeStream stream_super_column=new RewriteRuleSubtreeStream(adaptor,"rule super_column",super_column!=null?super_column.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 422:7: -> ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:422:10: ^( NODE_COLUMN_ACCESS columnFamily rowKey ( $column ( $super_column)? )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:422:51: ( $column ( $super_column)? )?
                if ( stream_super_column.hasNext()||stream_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_column.nextTree());
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:422:60: ( $super_column)?
                    if ( stream_super_column.hasNext() ) {
                        adaptor.addChild(root_1, stream_super_column.nextTree());

                    }
                    stream_super_column.reset();

                }
                stream_super_column.reset();
                stream_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class keyRangeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyRangeExpr"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:425:1: keyRangeExpr : '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) ;
    public final CliParser.keyRangeExpr_return keyRangeExpr() throws RecognitionException {
        CliParser.keyRangeExpr_return retval = new CliParser.keyRangeExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal239=null;
        Token char_literal240=null;
        Token char_literal241=null;
        CliParser.entityName_return startKey = null;

        CliParser.entityName_return endKey = null;


        CommonTree char_literal239_tree=null;
        CommonTree char_literal240_tree=null;
        CommonTree char_literal241_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_entityName=new RewriteRuleSubtreeStream(adaptor,"rule entityName");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:5: ( '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']' -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:10: '[' ( (startKey= entityName )? ':' (endKey= entityName )? )? ']'
            {
            char_literal239=(Token)match(input,115,FOLLOW_115_in_keyRangeExpr3266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(char_literal239);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:14: ( (startKey= entityName )? ':' (endKey= entityName )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=IntegerPositiveLiteral && LA34_0<=StringLiteral)||LA34_0==IntegerNegativeLiteral||LA34_0==120) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:16: (startKey= entityName )? ':' (endKey= entityName )?
                    {
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:24: (startKey= entityName )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=IntegerPositiveLiteral && LA32_0<=StringLiteral)||LA32_0==IntegerNegativeLiteral) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: startKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3272);
                            startKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(startKey.getTree());

                            }
                            break;

                    }

                    char_literal240=(Token)match(input,120,FOLLOW_120_in_keyRangeExpr3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal240);

                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:426:47: (endKey= entityName )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=IntegerPositiveLiteral && LA33_0<=StringLiteral)||LA33_0==IntegerNegativeLiteral) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: endKey= entityName
                            {
                            pushFollow(FOLLOW_entityName_in_keyRangeExpr3279);
                            endKey=entityName();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_entityName.add(endKey.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal241=(Token)match(input,117,FOLLOW_117_in_keyRangeExpr3285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal241);



            // AST REWRITE
            // elements: startKey, endKey
            // token labels: 
            // rule labels: endKey, retval, startKey
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_endKey=new RewriteRuleSubtreeStream(adaptor,"rule endKey",endKey!=null?endKey.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_startKey=new RewriteRuleSubtreeStream(adaptor,"rule startKey",startKey!=null?startKey.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 427:7: -> ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:427:10: ^( NODE_KEY_RANGE ( $startKey)? ( $endKey)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_KEY_RANGE, "NODE_KEY_RANGE"), root_1);

                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:427:27: ( $startKey)?
                if ( stream_startKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_startKey.nextTree());

                }
                stream_startKey.reset();
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:427:38: ( $endKey)?
                if ( stream_endKey.hasNext() ) {
                    adaptor.addChild(root_1, stream_endKey.nextTree());

                }
                stream_endKey.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyRangeExpr"

    public static class columnName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnName"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:430:1: columnName : entityName ;
    public final CliParser.columnName_return columnName() throws RecognitionException {
        CliParser.columnName_return retval = new CliParser.columnName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName242 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:431:2: ( entityName )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:431:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnName3319);
            entityName242=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName242.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnName"

    public static class attr_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_name"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:434:1: attr_name : Identifier ;
    public final CliParser.attr_name_return attr_name() throws RecognitionException {
        CliParser.attr_name_return retval = new CliParser.attr_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier243=null;

        CommonTree Identifier243_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:435:2: ( Identifier )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:435:4: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier243=(Token)match(input,Identifier,FOLLOW_Identifier_in_attr_name3330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier243_tree = (CommonTree)adaptor.create(Identifier243);
            adaptor.addChild(root_0, Identifier243_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_name"

    public static class attrValueString_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueString"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:438:1: attrValueString : ( Identifier | StringLiteral ) ;
    public final CliParser.attrValueString_return attrValueString() throws RecognitionException {
        CliParser.attrValueString_return retval = new CliParser.attrValueString_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set244=null;

        CommonTree set244_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:439:2: ( ( Identifier | StringLiteral ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:439:4: ( Identifier | StringLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set244=(Token)input.LT(1);
            if ( (input.LA(1)>=Identifier && input.LA(1)<=StringLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set244));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueString"

    public static class attrValueInt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueInt"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:442:1: attrValueInt : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.attrValueInt_return attrValueInt() throws RecognitionException {
        CliParser.attrValueInt_return retval = new CliParser.attrValueInt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set245=null;

        CommonTree set245_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:443:2: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set245=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set245));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueInt"

    public static class attrValueDouble_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValueDouble"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:447:1: attrValueDouble : DoubleLiteral ;
    public final CliParser.attrValueDouble_return attrValueDouble() throws RecognitionException {
        CliParser.attrValueDouble_return retval = new CliParser.attrValueDouble_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DoubleLiteral246=null;

        CommonTree DoubleLiteral246_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:448:2: ( DoubleLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:448:4: DoubleLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            DoubleLiteral246=(Token)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_attrValueDouble3381); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DoubleLiteral246_tree = (CommonTree)adaptor.create(DoubleLiteral246);
            adaptor.addChild(root_0, DoubleLiteral246_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrValueDouble"

    public static class keyspace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspace"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:451:1: keyspace : entityName ;
    public final CliParser.keyspace_return keyspace() throws RecognitionException {
        CliParser.keyspace_return retval = new CliParser.keyspace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName247 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:452:2: ( entityName )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:452:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspace3394);
            entityName247=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName247.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspace"

    public static class replica_placement_strategy_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "replica_placement_strategy"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:455:1: replica_placement_strategy : StringLiteral ;
    public final CliParser.replica_placement_strategy_return replica_placement_strategy() throws RecognitionException {
        CliParser.replica_placement_strategy_return retval = new CliParser.replica_placement_strategy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral248=null;

        CommonTree StringLiteral248_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:456:2: ( StringLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:456:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral248=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_replica_placement_strategy3405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral248_tree = (CommonTree)adaptor.create(StringLiteral248);
            adaptor.addChild(root_0, StringLiteral248_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "replica_placement_strategy"

    public static class keyspaceNewName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyspaceNewName"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:459:1: keyspaceNewName : entityName ;
    public final CliParser.keyspaceNewName_return keyspaceNewName() throws RecognitionException {
        CliParser.keyspaceNewName_return retval = new CliParser.keyspaceNewName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName249 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:460:2: ( entityName )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:460:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_keyspaceNewName3416);
            entityName249=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName249.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyspaceNewName"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:463:1: comparator : StringLiteral ;
    public final CliParser.comparator_return comparator() throws RecognitionException {
        CliParser.comparator_return retval = new CliParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral250=null;

        CommonTree StringLiteral250_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:464:2: ( StringLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:464:4: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral250=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_comparator3427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral250_tree = (CommonTree)adaptor.create(StringLiteral250);
            adaptor.addChild(root_0, StringLiteral250_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:467:1: command : Identifier ;
    public final CliParser.command_return command() throws RecognitionException {
        CliParser.command_return retval = new CliParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier251=null;

        CommonTree Identifier251_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:467:9: ( Identifier )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:467:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier251=(Token)match(input,Identifier,FOLLOW_Identifier_in_command3443); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier251_tree = (CommonTree)adaptor.create(Identifier251);
            adaptor.addChild(root_0, Identifier251_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class newColumnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newColumnFamily"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:470:1: newColumnFamily : entityName ;
    public final CliParser.newColumnFamily_return newColumnFamily() throws RecognitionException {
        CliParser.newColumnFamily_return retval = new CliParser.newColumnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName252 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:471:2: ( entityName )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:471:4: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_newColumnFamily3454);
            entityName252=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName252.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newColumnFamily"

    public static class username_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "username"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:474:1: username : Identifier ;
    public final CliParser.username_return username() throws RecognitionException {
        CliParser.username_return retval = new CliParser.username_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier253=null;

        CommonTree Identifier253_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:474:9: ( Identifier )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:474:11: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier253=(Token)match(input,Identifier,FOLLOW_Identifier_in_username3463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier253_tree = (CommonTree)adaptor.create(Identifier253);
            adaptor.addChild(root_0, Identifier253_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"

    public static class password_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "password"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:477:1: password : StringLiteral ;
    public final CliParser.password_return password() throws RecognitionException {
        CliParser.password_return retval = new CliParser.password_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral254=null;

        CommonTree StringLiteral254_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:477:9: ( StringLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:477:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral254=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_password3472); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral254_tree = (CommonTree)adaptor.create(StringLiteral254);
            adaptor.addChild(root_0, StringLiteral254_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "password"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:480:1: columnFamily : entityName ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.entityName_return entityName255 = null;



        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:481:3: ( entityName )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:481:5: entityName
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_entityName_in_columnFamily3484);
            entityName255=entityName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, entityName255.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class entityName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entityName"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:484:1: entityName : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) ;
    public final CliParser.entityName_return entityName() throws RecognitionException {
        CliParser.entityName_return retval = new CliParser.entityName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set256=null;

        CommonTree set256_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:485:3: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:485:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            {
            root_0 = (CommonTree)adaptor.nil();

            set256=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set256));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entityName"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:488:1: rowKey : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier257=null;
        Token StringLiteral258=null;
        Token IntegerPositiveLiteral259=null;
        Token IntegerNegativeLiteral260=null;
        CliParser.functionCall_return functionCall261 = null;


        CommonTree Identifier257_tree=null;
        CommonTree StringLiteral258_tree=null;
        CommonTree IntegerPositiveLiteral259_tree=null;
        CommonTree IntegerNegativeLiteral260_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:5: ( ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:8: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral | functionCall )
            int alt35=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==121) ) {
                    alt35=5;
                }
                else if ( (LA35_1==117||LA35_1==120) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                alt35=2;
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt35=3;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:9: Identifier
                    {
                    Identifier257=(Token)match(input,Identifier,FOLLOW_Identifier_in_rowKey3529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier257_tree = (CommonTree)adaptor.create(Identifier257);
                    adaptor.addChild(root_0, Identifier257_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:22: StringLiteral
                    {
                    StringLiteral258=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey3533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral258_tree = (CommonTree)adaptor.create(StringLiteral258);
                    adaptor.addChild(root_0, StringLiteral258_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:38: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral259=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_rowKey3537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral259_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral259);
                    adaptor.addChild(root_0, IntegerPositiveLiteral259_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:63: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral260=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_rowKey3541); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral260_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral260);
                    adaptor.addChild(root_0, IntegerNegativeLiteral260_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:489:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_rowKey3545);
                    functionCall261=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall261.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:492:1: value : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier262=null;
        Token IntegerPositiveLiteral263=null;
        Token IntegerNegativeLiteral264=null;
        Token StringLiteral265=null;
        CliParser.functionCall_return functionCall266 = null;


        CommonTree Identifier262_tree=null;
        CommonTree IntegerPositiveLiteral263_tree=null;
        CommonTree IntegerNegativeLiteral264_tree=null;
        CommonTree StringLiteral265_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:5: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:7: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt36=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==121) ) {
                    alt36=5;
                }
                else if ( (LA36_1==EOF||LA36_1==SEMICOLON||LA36_1==WITH||LA36_1==AND||LA36_1==LIMIT||LA36_1==116||LA36_1==119) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt36=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt36=3;
                }
                break;
            case StringLiteral:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:8: Identifier
                    {
                    Identifier262=(Token)match(input,Identifier,FOLLOW_Identifier_in_value3562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier262_tree = (CommonTree)adaptor.create(Identifier262);
                    adaptor.addChild(root_0, Identifier262_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:21: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral263=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_value3566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral263_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral263);
                    adaptor.addChild(root_0, IntegerPositiveLiteral263_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:46: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral264=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_value3570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral264_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral264);
                    adaptor.addChild(root_0, IntegerNegativeLiteral264_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:71: StringLiteral
                    {
                    StringLiteral265=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value3574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral265_tree = (CommonTree)adaptor.create(StringLiteral265);
                    adaptor.addChild(root_0, StringLiteral265_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:493:87: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_value3578);
                    functionCall266=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall266.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:496:1: functionCall : functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) ;
    public final CliParser.functionCall_return functionCall() throws RecognitionException {
        CliParser.functionCall_return retval = new CliParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token functionName=null;
        Token char_literal267=null;
        Token char_literal269=null;
        CliParser.functionArgument_return functionArgument268 = null;


        CommonTree functionName_tree=null;
        CommonTree char_literal267_tree=null;
        CommonTree char_literal269_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:497:5: (functionName= Identifier '(' ( functionArgument )? ')' -> ^( FUNCTION_CALL $functionName ( functionArgument )? ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:497:7: functionName= Identifier '(' ( functionArgument )? ')'
            {
            functionName=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall3596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(functionName);

            char_literal267=(Token)match(input,121,FOLLOW_121_in_functionCall3598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_121.add(char_literal267);

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:497:35: ( functionArgument )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=IntegerPositiveLiteral && LA37_0<=StringLiteral)||LA37_0==IntegerNegativeLiteral) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:0:0: functionArgument
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3600);
                    functionArgument268=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument268.getTree());

                    }
                    break;

            }

            char_literal269=(Token)match(input,122,FOLLOW_122_in_functionCall3603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal269);



            // AST REWRITE
            // elements: functionName, functionArgument
            // token labels: functionName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_functionName=new RewriteRuleTokenStream(adaptor,"token functionName",functionName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 498:9: -> ^( FUNCTION_CALL $functionName ( functionArgument )? )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:498:12: ^( FUNCTION_CALL $functionName ( functionArgument )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextNode());
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:498:42: ( functionArgument )?
                if ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:501:1: functionArgument : ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.functionArgument_return functionArgument() throws RecognitionException {
        CliParser.functionArgument_return retval = new CliParser.functionArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set270=null;

        CommonTree set270_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:502:5: ( Identifier | StringLiteral | IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set270=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerPositiveLiteral && input.LA(1)<=StringLiteral)||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set270));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:505:1: columnOrSuperColumn : ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier271=null;
        Token IntegerPositiveLiteral272=null;
        Token IntegerNegativeLiteral273=null;
        Token StringLiteral274=null;
        CliParser.functionCall_return functionCall275 = null;


        CommonTree Identifier271_tree=null;
        CommonTree IntegerPositiveLiteral272_tree=null;
        CommonTree IntegerNegativeLiteral273_tree=null;
        CommonTree StringLiteral274_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:2: ( ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:4: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:4: ( Identifier | IntegerPositiveLiteral | IntegerNegativeLiteral | StringLiteral | functionCall )
            int alt38=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==121) ) {
                    alt38=5;
                }
                else if ( ((LA38_1>=109 && LA38_1<=113)||LA38_1==117) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case IntegerPositiveLiteral:
                {
                alt38=2;
                }
                break;
            case IntegerNegativeLiteral:
                {
                alt38=3;
                }
                break;
            case StringLiteral:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:5: Identifier
                    {
                    Identifier271=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnOrSuperColumn3668); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier271_tree = (CommonTree)adaptor.create(Identifier271);
                    adaptor.addChild(root_0, Identifier271_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:18: IntegerPositiveLiteral
                    {
                    IntegerPositiveLiteral272=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn3672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerPositiveLiteral272_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral272);
                    adaptor.addChild(root_0, IntegerPositiveLiteral272_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:43: IntegerNegativeLiteral
                    {
                    IntegerNegativeLiteral273=(Token)match(input,IntegerNegativeLiteral,FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn3676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IntegerNegativeLiteral273_tree = (CommonTree)adaptor.create(IntegerNegativeLiteral273);
                    adaptor.addChild(root_0, IntegerNegativeLiteral273_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:68: StringLiteral
                    {
                    StringLiteral274=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn3680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral274_tree = (CommonTree)adaptor.create(StringLiteral274);
                    adaptor.addChild(root_0, StringLiteral274_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:506:84: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_columnOrSuperColumn3684);
                    functionCall275=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall275.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:509:1: host : host_name -> ^( NODE_ID_LIST host_name ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.host_name_return host_name276 = null;


        RewriteRuleSubtreeStream stream_host_name=new RewriteRuleSubtreeStream(adaptor,"rule host_name");
        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:510:5: ( host_name -> ^( NODE_ID_LIST host_name ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:510:7: host_name
            {
            pushFollow(FOLLOW_host_name_in_host3700);
            host_name276=host_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_host_name.add(host_name276.getTree());


            // AST REWRITE
            // elements: host_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 511:9: -> ^( NODE_ID_LIST host_name )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:511:12: ^( NODE_ID_LIST host_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_host_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class host_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host_name"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:514:1: host_name : Identifier ( '.' Identifier )* ;
    public final CliParser.host_name_return host_name() throws RecognitionException {
        CliParser.host_name_return retval = new CliParser.host_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier277=null;
        Token char_literal278=null;
        Token Identifier279=null;

        CommonTree Identifier277_tree=null;
        CommonTree char_literal278_tree=null;
        CommonTree Identifier279_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:515:2: ( Identifier ( '.' Identifier )* )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:515:4: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier277=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier277_tree = (CommonTree)adaptor.create(Identifier277);
            adaptor.addChild(root_0, Identifier277_tree);
            }
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:515:15: ( '.' Identifier )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==114) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:515:16: '.' Identifier
            	    {
            	    char_literal278=(Token)match(input,114,FOLLOW_114_in_host_name3730); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal278_tree = (CommonTree)adaptor.create(char_literal278);
            	    adaptor.addChild(root_0, char_literal278_tree);
            	    }
            	    Identifier279=(Token)match(input,Identifier,FOLLOW_Identifier_in_host_name3732); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier279_tree = (CommonTree)adaptor.create(Identifier279);
            	    adaptor.addChild(root_0, Identifier279_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host_name"

    public static class ip_address_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_address"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:518:1: ip_address : IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) ;
    public final CliParser.ip_address_return ip_address() throws RecognitionException {
        CliParser.ip_address_return retval = new CliParser.ip_address_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IP_ADDRESS280=null;

        CommonTree IP_ADDRESS280_tree=null;
        RewriteRuleTokenStream stream_IP_ADDRESS=new RewriteRuleTokenStream(adaptor,"token IP_ADDRESS");

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:519:2: ( IP_ADDRESS -> ^( NODE_ID_LIST IP_ADDRESS ) )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:519:4: IP_ADDRESS
            {
            IP_ADDRESS280=(Token)match(input,IP_ADDRESS,FOLLOW_IP_ADDRESS_in_ip_address3746); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IP_ADDRESS.add(IP_ADDRESS280);



            // AST REWRITE
            // elements: IP_ADDRESS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 520:6: -> ^( NODE_ID_LIST IP_ADDRESS )
            {
                // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:520:9: ^( NODE_ID_LIST IP_ADDRESS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                adaptor.addChild(root_1, stream_IP_ADDRESS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip_address"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:524:1: port : IntegerPositiveLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerPositiveLiteral281=null;

        CommonTree IntegerPositiveLiteral281_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:525:5: ( IntegerPositiveLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:525:7: IntegerPositiveLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerPositiveLiteral281=(Token)match(input,IntegerPositiveLiteral,FOLLOW_IntegerPositiveLiteral_in_port3776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerPositiveLiteral281_tree = (CommonTree)adaptor.create(IntegerPositiveLiteral281);
            adaptor.addChild(root_0, IntegerPositiveLiteral281_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    public static class incrementValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incrementValue"
    // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:528:1: incrementValue : ( IntegerPositiveLiteral | IntegerNegativeLiteral );
    public final CliParser.incrementValue_return incrementValue() throws RecognitionException {
        CliParser.incrementValue_return retval = new CliParser.incrementValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set282=null;

        CommonTree set282_tree=null;

        try {
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:529:5: ( IntegerPositiveLiteral | IntegerNegativeLiteral )
            // /Users/devdatta.kulkarni/Documents/Cassandra/apache-cassandra-0.8.6-src/src/java/org/apache/cassandra/cli/Cli.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( input.LA(1)==IntegerPositiveLiteral||input.LA(1)==IntegerNegativeLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set282));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "incrementValue"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\1\23\34\uffff";
    static final String DFA2_minS =
        "\1\56\3\uffff\4\63\25\uffff";
    static final String DFA2_maxS =
        "\1\152\3\uffff\1\150\2\74\1\77\25\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\30\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\27";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\23\1\1\1\13\1\10\1\4\1\uffff\2\2\1\16\3\uffff\1\5\1\6\2\uffff"+
            "\1\7\1\uffff\1\12\1\14\2\15\1\11\1\3\1\17\1\20\1\21\1\22\40"+
            "\uffff\1\13",
            "",
            "",
            "",
            "\1\24\64\uffff\1\25",
            "\1\26\10\uffff\1\27",
            "\1\30\10\uffff\1\31",
            "\1\33\10\uffff\1\32\2\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "142:1: statement : ( connectStatement | exitStatement | countStatement | describeTable | describeCluster | addKeyspace | addColumnFamily | updateKeyspace | updateColumnFamily | delColumnFamily | delKeyspace | useKeyspace | delStatement | getStatement | helpStatement | setStatement | incrStatement | showStatement | listStatement | truncateStatement | assumeStatement | consistencyLevelStatement | dropIndex | -> ^( NODE_NO_OP ) );";
        }
    }
    static final String DFA6_eotS =
        "\45\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\27\43\uffff";
    static final String DFA6_minS =
        "\1\60\1\56\4\uffff\1\63\2\uffff\1\67\3\63\30\uffff";
    static final String DFA6_maxS =
        "\1\152\1\111\4\uffff\1\150\2\uffff\1\151\2\74\1\77\30\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\36\1\1\1\2\1\3\1\uffff\1\6\1\7\4\uffff\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\4\1\5\1\10\1\11\1\12"+
        "\1\13\1\14\1\16\1\15\1\17\1\20\1\21\1\22";
    static final String DFA6_specialS =
        "\45\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\71\uffff\1\2",
            "\1\27\1\4\1\3\1\5\1\6\1\uffff\1\7\1\10\1\11\3\uffff\1\12\1"+
            "\13\2\uffff\1\14\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\26",
            "",
            "",
            "",
            "",
            "\1\30\64\uffff\1\31",
            "",
            "",
            "\1\33\1\34\1\35\57\uffff\1\32",
            "\1\36\10\uffff\1\37",
            "\1\40\10\uffff\1\41",
            "\1\42\10\uffff\1\43\2\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "176:1: helpStatement : ( HELP HELP -> ^( NODE_HELP NODE_HELP ) | HELP CONNECT -> ^( NODE_HELP NODE_CONNECT ) | HELP USE -> ^( NODE_HELP NODE_USE_TABLE ) | HELP DESCRIBE KEYSPACE -> ^( NODE_HELP NODE_DESCRIBE_TABLE ) | HELP DESCRIBE 'CLUSTER' -> ^( NODE_HELP NODE_DESCRIBE_CLUSTER ) | HELP EXIT -> ^( NODE_HELP NODE_EXIT ) | HELP QUIT -> ^( NODE_HELP NODE_EXIT ) | HELP SHOW 'CLUSTER NAME' -> ^( NODE_HELP NODE_SHOW_CLUSTER_NAME ) | HELP SHOW KEYSPACES -> ^( NODE_HELP NODE_SHOW_KEYSPACES ) | HELP SHOW SCHEMA -> ^( NODE_HELP NODE_SHOW_SCHEMA ) | HELP SHOW API_VERSION -> ^( NODE_HELP NODE_SHOW_VERSION ) | HELP CREATE KEYSPACE -> ^( NODE_HELP NODE_ADD_KEYSPACE ) | HELP UPDATE KEYSPACE -> ^( NODE_HELP NODE_UPDATE_KEYSPACE ) | HELP CREATE COLUMN FAMILY -> ^( NODE_HELP NODE_ADD_COLUMN_FAMILY ) | HELP UPDATE COLUMN FAMILY -> ^( NODE_HELP NODE_UPDATE_COLUMN_FAMILY ) | HELP DROP KEYSPACE -> ^( NODE_HELP NODE_DEL_KEYSPACE ) | HELP DROP COLUMN FAMILY -> ^( NODE_HELP NODE_DEL_COLUMN_FAMILY ) | HELP DROP INDEX -> ^( NODE_HELP NODE_DROP_INDEX ) | HELP GET -> ^( NODE_HELP NODE_THRIFT_GET ) | HELP SET -> ^( NODE_HELP NODE_THRIFT_SET ) | HELP INCR -> ^( NODE_HELP NODE_THRIFT_INCR ) | HELP DECR -> ^( NODE_HELP NODE_THRIFT_DECR ) | HELP DEL -> ^( NODE_HELP NODE_THRIFT_DEL ) | HELP COUNT -> ^( NODE_HELP NODE_THRIFT_COUNT ) | HELP LIST -> ^( NODE_HELP NODE_LIST ) | HELP TRUNCATE -> ^( NODE_HELP NODE_TRUNCATE ) | HELP ASSUME -> ^( NODE_HELP NODE_ASSUME ) | HELP CONSISTENCYLEVEL -> ^( NODE_HELP NODE_CONSISTENCY_LEVEL ) | HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_root421 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStatement_in_statement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStatement_in_statement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStatement_in_statement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeCluster_in_statement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addKeyspace_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addColumnFamily_in_statement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateKeyspace_in_statement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnFamily_in_statement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delColumnFamily_in_statement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delKeyspace_in_statement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useKeyspace_in_statement530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delStatement_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStatement_in_statement546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStatement_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_statement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incrStatement_in_statement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStatement_in_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listStatement_in_statement586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_statement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assumeStatement_in_statement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_consistencyLevelStatement_in_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndex_in_statement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_host_in_connectStatement649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_connectStatement651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_port_in_connectStatement653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_username_in_connectStatement656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_password_in_connectStatement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONNECT_in_connectStatement693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ip_address_in_connectStatement695 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_connectStatement697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_port_in_connectStatement699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_username_in_connectStatement702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_password_in_connectStatement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement748 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_HELP_in_helpStatement750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement775 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONNECT_in_helpStatement777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement802 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_USE_in_helpStatement804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement829 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement831 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement858 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_DESCRIBE_in_helpStatement860 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_helpStatement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement886 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_EXIT_in_helpStatement888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement913 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUIT_in_helpStatement915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement940 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement942 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_helpStatement944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement968 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement970 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_helpStatement972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement997 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement999 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_helpStatement1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1029 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SHOW_in_helpStatement1031 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_helpStatement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1057 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1059 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1086 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1088 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1114 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_CREATE_in_helpStatement1116 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1118 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1145 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_helpStatement1147 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1149 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1175 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1177 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_helpStatement1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1204 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1206 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_helpStatement1208 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_helpStatement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1235 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DROP_in_helpStatement1237 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INDEX_in_helpStatement1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_GET_in_helpStatement1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_helpStatement1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INCR_in_helpStatement1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DECR_in_helpStatement1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DEL_in_helpStatement1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COUNT_in_helpStatement1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LIST_in_helpStatement1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TRUNCATE_in_helpStatement1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ASSUME_in_helpStatement1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_helpStatement1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HELP_in_helpStatement1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_helpStatement1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIT_in_exitStatement1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitStatement1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStatement1625 = new BitSet(new long[]{0x0000000000000002L,0x0000080000800000L});
    public static final BitSet FOLLOW_107_in_getStatement1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_typeIdentifier_in_getStatement1630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_getStatement1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_getStatement1686 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_getStatement1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000820000L});
    public static final BitSet FOLLOW_AND_in_getStatement1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_getCondition_in_getStatement1695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000820000L});
    public static final BitSet FOLLOW_LIMIT_in_getStatement1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_getStatement1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_getCondition1755 = new BitSet(new long[]{0x0000000000000000L,0x0003E00000000000L});
    public static final BitSet FOLLOW_operator_in_getCondition1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_value_in_getCondition1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeIdentifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setStatement1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStatement1857 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_setStatement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_value_in_setStatement1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_WITH_in_setStatement1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_TTL_in_setStatement1868 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_setStatement1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_setStatement1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_incrStatement1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement1922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_BY_in_incrStatement1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_incrStatement1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_incrStatement1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_BY_in_incrStatement1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_incrementValue_in_incrStatement1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_countStatement2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_countStatement2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEL_in_delStatement2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_delStatement2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStatement2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStatement2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showKeyspaces_in_showStatement2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showSchema_in_showStatement2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_listStatement2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_listStatement2130 = new BitSet(new long[]{0x0000000000000002L,0x0008000000800000L});
    public static final BitSet FOLLOW_keyRangeExpr_in_listStatement2132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LIMIT_in_listStatement2136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_listStatement2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUNCATE_in_truncateStatement2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_truncateStatement2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSUME_in_assumeStatement2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_assumeStatement2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement2227 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_assumeStatement2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Identifier_in_assumeStatement2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSISTENCYLEVEL_in_consistencyLevelStatement2272 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_consistencyLevelStatement2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Identifier_in_consistencyLevelStatement2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showClusterName2312 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_showClusterName2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addKeyspace2345 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_addKeyspace2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addKeyspace2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_addColumnFamily2383 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_addColumnFamily2385 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_addColumnFamily2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_addColumnFamily2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateKeyspace2423 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_updateKeyspace2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateKeyspace2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_updateColumnFamily2460 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_updateColumnFamily2462 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_updateColumnFamily2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyValuePairExpr_in_updateColumnFamily2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delKeyspace2499 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_delKeyspace2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyspace_in_delKeyspace2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_delColumnFamily2537 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_COLUMN_in_delColumnFamily2539 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_FAMILY_in_delColumnFamily2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_delColumnFamily2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropIndex2577 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INDEX_in_dropIndex2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ON_in_dropIndex2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnFamily_in_dropIndex2583 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_dropIndex2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnName_in_dropIndex2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showVersion2622 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_API_VERSION_in_showVersion2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showKeyspaces2655 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KEYSPACES_in_showKeyspaces2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_showSchema2689 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_showSchema2691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyspace_in_showSchema2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeTable2732 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYSPACE_in_describeTable2734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyspace_in_describeTable2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeCluster2779 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_describeCluster2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useKeyspace2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_keyspace_in_useKeyspace2814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_username_in_useKeyspace2818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_password_in_useKeyspace2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyValuePairExpr2877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000022000L});
    public static final BitSet FOLLOW_AND_in_keyValuePairExpr2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WITH_in_keyValuePairExpr2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_keyValuePair_in_keyValuePairExpr2889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000022000L});
    public static final BitSet FOLLOW_attr_name_in_keyValuePair2946 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_keyValuePair2948 = new BitSet(new long[]{0x0000000000000000L,0x00080000000C1C00L});
    public static final BitSet FOLLOW_attrValue_in_keyValuePair2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayConstruct_in_attrValue2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueString_in_attrValue2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueInt_in_attrValue2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrValueDouble_in_attrValue3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_arrayConstruct3022 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_hashConstruct_in_arrayConstruct3025 = new BitSet(new long[]{0x0000000000000000L,0x0070000000000000L});
    public static final BitSet FOLLOW_116_in_arrayConstruct3027 = new BitSet(new long[]{0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_117_in_arrayConstruct3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_hashConstruct3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3072 = new BitSet(new long[]{0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_116_in_hashConstruct3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_hashElementPair_in_hashConstruct3077 = new BitSet(new long[]{0x0000000000000000L,0x0090000000000000L});
    public static final BitSet FOLLOW_119_in_hashConstruct3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowKey_in_hashElementPair3117 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_hashElementPair3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_value_in_hashElementPair3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr3156 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_columnFamilyExpr3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr3160 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3162 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_columnFamilyExpr3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3179 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3181 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_columnFamilyExpr3197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000041C00L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr3201 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_columnFamilyExpr3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_keyRangeExpr3266 = new BitSet(new long[]{0x0000000000000000L,0x0120000000041C00L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3272 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_keyRangeExpr3275 = new BitSet(new long[]{0x0000000000000000L,0x0020000000041C00L});
    public static final BitSet FOLLOW_entityName_in_keyRangeExpr3279 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_keyRangeExpr3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnName3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_attr_name3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueString3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attrValueInt0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_attrValueDouble3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspace3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_replica_placement_strategy3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_keyspaceNewName3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_comparator3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_command3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_newColumnFamily3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_username3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_password3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entityName_in_columnFamily3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_entityName3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_rowKey3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_rowKey3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_rowKey3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_rowKey3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_value3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_value3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_value3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_value3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall3596 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_functionCall3598 = new BitSet(new long[]{0x0000000000000000L,0x0400000000041C00L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3600 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_functionCall3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_functionArgument0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnOrSuperColumn3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_columnOrSuperColumn3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerNegativeLiteral_in_columnOrSuperColumn3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_columnOrSuperColumn3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_host_name_in_host3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_host_name3727 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_host_name3730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Identifier_in_host_name3732 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_IP_ADDRESS_in_ip_address3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerPositiveLiteral_in_port3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrementValue0 = new BitSet(new long[]{0x0000000000000002L});

}