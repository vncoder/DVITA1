
import com.mytest.dvita.shared.DocumentInfo;
public class Tupel implements Comparable<Tupel>{
	Double SimilarityValue;
	public DocumentInfo theDoc;

    public Tupel(Double SimilarityValue1, DocumentInfo doc) {
        this.SimilarityValue = SimilarityValue1;
        this.theDoc = doc;
    }

    @Override
    public int compareTo(Tupel o) {
        return SimilarityValue < o.SimilarityValue ? -1 :SimilarityValue > o.SimilarityValue ? 1 : 0;
    }

}
