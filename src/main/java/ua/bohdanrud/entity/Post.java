package ua.bohdanrud.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.bohdanrud.validators.CheckPostNameExists;

@Entity
@Table(name = "post")
@NoArgsConstructor
@Getter
@Setter
public class Post extends BaseEntity {

	@Column(name = "name")
	@CheckPostNameExists
	private String name;

	@Column(name = "posts_text", length = 1000)
	@NotEmpty(message = "Field can't be empty")
	private String postsText;

	@ManyToMany
	@JoinTable(name = "user_post", joinColumns = @JoinColumn(name = "post_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<>();

}
