import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.util.Objects;

public class Euro {
    final double amount;

    public Euro(Double amount){
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return Double.compare(euro.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Euro add(Euro obj2){
        return new Euro(amount + obj2.amount);

    }
}

