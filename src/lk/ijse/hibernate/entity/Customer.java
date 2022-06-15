package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customer")
public class Customer implements SuperEntity{
    @Id
    private String id;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(columnDefinition = "TEXT")
    private String address;
}
