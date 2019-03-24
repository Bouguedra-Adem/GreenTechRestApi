package App.Model.lot1_5;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Document")
public class Document {
	
   public Document(long id, String description, Date date_publication, Date dateMsj, String type) {
		super();
		this.id = id;
		Description = description;
		this.date_publication = date_publication;
		this.dateMsj = dateMsj;
		this.type = type;
	}
   public Document() {}
@Id 
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   @Column(name="Description")  
    private String Description="";
   @Column(name="date_publication")
    private Date date_publication;
   @Column (name="dateMsj")
   private Date dateMsj;
   @Column (name="type")
    private String type="";
 
    
    @ManyToOne
    @JoinColumn(name="ged_id")
    private App.Model.lot1_5.Ged Ged;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public Date getDate_publication() {
			return date_publication;
		}
		public void setDate_publication(Date date_publication) {
			this.date_publication = date_publication;
		}
		public Date getDateMsj() {
			return dateMsj;
		}
		public void setDateMsj(Date dateMsj) {
			this.dateMsj = dateMsj;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		   
		  
} 
