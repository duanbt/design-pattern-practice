package practice.language;

/**
 * {@code <program> ::= program <command list>}
 *
 * @author duanbt
 **/
public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public void execute() throws ExecuteException {
        commandListNode.execute();
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
