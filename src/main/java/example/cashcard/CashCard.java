package example.cashcard;
import org.springframework.data.annotation.Id;
public record CashCard(Long id, Double amount) {
}