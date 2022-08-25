package work.learn_docker.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "personne")
public class Personne implements Serializable{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    @Basic
    @Column(name = "prenom")
    private String prenom;

    @Basic
    @Column(name = "nom")
    private String nom;

    @Basic
    @Column(name = "adresse")
    private String adresse;

}
