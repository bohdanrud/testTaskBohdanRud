package ua.bohdanrud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.bohdanrud.entity.enums.Country;
import ua.bohdanrud.validators.CheckUserNameExists;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

	@NotNull(message = "Field fullName can't be null")
	@NotEmpty(message = "Field fullName can't be empty")
	@Column(name = "full_name")
	@CheckUserNameExists
	private String fullName;

	@Min(value = 10, message = "Should be more than 10")
	@Max(value = 75, message = "Should be less than 75")
	private int age;

	@NotNull(message = "Can't be empty")
	@Size(min = 5, max = 50, message = "Should be 5-50")
	private String email;

	@NotNull(message = "Can't be empty")
	@Size(min = 5, max = 15, message = "Should be 5-15")
	private String password;

	@Enumerated(EnumType.ORDINAL)
	private Country country;

	@ManyToMany
	@JoinTable(name = "user_post", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "post_id"))
	private Set<Post> posts = new HashSet<>();

	public void addLikedPost(Post post) {
		posts.add(post);
	}

}
