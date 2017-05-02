package sonalake.calc.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 5/1/17
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "currency")
@NoArgsConstructor
@Data
public class Currency implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="code", nullable = false, unique = true)
    String code;

    @Column(name="display_name")
    String displayName;

    public Currency(String code ){
        this.code = code;
    }

}
