package rs.ac.uns.ftn.Bookify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.ac.uns.ftn.Bookify.model.Address;
import rs.ac.uns.ftn.Bookify.model.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private boolean blocked;
    private String phone;
    private Address address;
    private Long imageId;
    public UserDetailDTO(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.blocked = user.isBlocked();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        if(user.getProfileImage() != null) {
            this.imageId = user.getProfileImage().getId();
        }
    }
}
