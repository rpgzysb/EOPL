package letlang.ast;

import letlang.interpreter.AbstractInterpret;
import letlang.interpreter.RetType;

public class MulExp extends BinaryExp {

    public MulExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
        // TODO Auto-generated constructor stub
    }

    public RetType visit(AbstractInterpret letVisitor) {
        return letVisitor.visit(this);
    }
    
}
