package stringbuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}

	public static SimpleDateFormat dateFormat() {
		return new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.getTitle() + "\n");
		sb.append(this.getLikes());
		sb.append(" Likes - ");
		sb.append(dateFormat().format(this.getMoment()) + "\n");
		sb.append(this.getContent() + "\n");
		sb.append("Comments: \n");

		for (Comment c : this.comments) {
			sb.append(c.getText() + "\n");
		}

		return sb.toString();
	}
}
