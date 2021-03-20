package posmy.interview.boot.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "librarian")
public class Librarian implements JpaEntity<Long>, UserAware<Long> {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String token;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean isMember() {
        return false;
    }

    @Override
    public boolean isLibrarian() {
        return true;
    }

    @Override
    public String getName() {
        return getUsername();
    }
}