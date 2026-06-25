package HashCode;

import java.util.Objects;

public class HashCodeDemoSach {
    String isbn;
    String tenSach;

    public HashCodeDemoSach(String isbn, String tenSach) {
        this.isbn = isbn;
        this.tenSach = tenSach;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        HashCodeDemoSach sachKhac = (HashCodeDemoSach) obj;
        return this.isbn.equals(sachKhac.isbn);
    }
    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }
}
