package evaluationWithVisitor;

import model.*;

public interface ArrayOperationsVisitor<R> {
    // classes to visit
    // The whole command: CommandLine
    // The Instructions
    //   - Value (push the value)
    //   - binary operators (compute the operation (pop two values, compute, push result)
    //   - unary operators (opposite -> pop, push opposite; duplicate -> peek, push peeked)

    R visit(Program program);

    R visit(Max max);

    R visit(Min min);

    R visit(Prod prod);

    R visit(Sort sort);

    R visit(Sum sum);

    R visit(varOut vo);

    R visit(varIn vi);

    R visit(Affectation<?> affectation);

    R visit(VariableDeclaration<?> variableDeclaration);
}
