package itea.serhii.sbserver.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BlockedSite {

    @Id
    @GeneratedValue
    private int id;

    private String url;

    public BlockedSite(String url) {
        this.url = url;
    }
}
