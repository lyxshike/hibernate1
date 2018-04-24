package compositeKey;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="_teacherPK")
public class TeacherP {
	
	
	private TeacherPK pk;

	//@Id
	@EmbeddedId
	
	public TeacherPK getPk() {
		return pk;
	}

	public void setPk(TeacherPK pk) {
		this.pk = pk;
	}
	
}
