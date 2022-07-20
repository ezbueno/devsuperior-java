package exercicio.resolvido.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
	private String username;
	private Date moment;

	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(this.username, other.username);
	}
}
