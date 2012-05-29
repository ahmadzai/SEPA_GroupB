
package Helper;

import java.awt.*;

import javax.swing.*;

import GUI.AddEditContactForm;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.print.*;
import java.util.Observer;

/*
public class Printing implements Printable, ActionListener{
	 
    JFrame newFrame;
    
    public Printing(JFrame f) {
        newFrame = f;
    }
 
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
 
        if (page > 0) { 
            return NO_SUCH_PAGE;
        }
 
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
        newFrame.printAll(g);
 
        return PAGE_EXISTS;
    }
    
    public void actionPerformed(ActionEvent e) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                 job.print();
            } catch (PrinterException ex) {
            
            }
        }
   }
    
    
}

*/
public class Printing implements Printable {
	private Component componentToBePrinted;
	private AddEditContactForm contactform;

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String mobileNr;
	private String phoneNr;
	private String faxNr;
	private String emailAdd;
	private String city;
	private String country;
	private String street;
	private String apNr;
	private String zipCode;
	private String group;
	private String coments;
	private String lblFirstName;
	private String lblLastName;
	private String lblDateOfBirth;
	private String lblMobileNr;
	private String lblPhoneNr;
	private String lblFaxNr;
	private String lblEmailAdd;
	private String lblCity;
	private String lblCountry;
	private String lblStreet;
	private String lblApNr;
	private String lblZipCode;
	private String lblGroup;
	private String lblComents;
	private Image image;
	private Observer observer;
	  public String getFirstName() {
		return firstName;
	}
	  public String getlblFirstName() {
			return lblFirstName;
		}
	  

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlblFirstName(String lblFirstName) {
		this.lblFirstName = lblFirstName;
	}
	
	
    public String getLastName() {
			return lastName;
	}
    
    public String getlblLastName() {
		return lblLastName;
    }
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setlblLastName(String lblLastName) {
		this.lblLastName = lblLastName;
	}
	
	 public String getDate() {
			return dateOfBirth;
		}
	 
	 public String getlblDate() {
			return lblDateOfBirth;
		}
	public void setDate(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setlblDate(String lblDateOfBirth) {
		this.lblDateOfBirth = lblDateOfBirth;
	}
	
	 public String getMobileNr() {
			return mobileNr;
		}
	 
	 public String getlblMobileNr() {
			return lblMobileNr;
		}
	public void setMobileNr(String mobileNr) {
		this.mobileNr = mobileNr;
	}
	
	public void setlblMobileNr(String lblMobileNr) {
		this.lblMobileNr = lblMobileNr;
	}
	
	 public String getPhoneNr() {
			return phoneNr;
		}
	 
	 public String getlblPhoneNr() {
			return lblPhoneNr;
		}
	 
	 public void setPhoneNr(String phoneNr) {
			this.phoneNr = phoneNr;
		}
	public void setlblPhoneNr(String lblPhoneNr) {
		this.lblPhoneNr = lblPhoneNr;
	}
	
	 public String getFaxNr() {
			return faxNr;
		}
	 
	 public String getlblFaxNr() {
			return lblFaxNr;
		}
	public void setFaxNr(String faxNr) {
		this.faxNr = faxNr;
	}
	
	public void setlblFaxNr(String lblFaxNr) {
		this.lblFaxNr = lblFaxNr;
	}
	
	 public String getEmailAdd() {
			return emailAdd;
		}
	 
	 public String getlblEmailAdd() {
			return lblEmailAdd;
		}
	 
	 public void setEmailAdd(String EmailAdd) {
			this.emailAdd = EmailAdd;
		}
	 
	public void setlblEmailAdd(String lblEmailAdd) {
		this.lblEmailAdd = lblEmailAdd;
	}
	
	 public String getCountry() {
			return country;
		}
	 public String getlblCountry() {
			return lblCountry;
		}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setlblCountry(String lblCountry) {
		this.lblCountry = lblCountry;
	}
	
	 public String getCity() {
			return city;
		}
	 
	 public String getlblCity() {
			return lblCity;
		}
	public void setCity(String city) {
		this.city = city;
	}
	public void setlblCity(String lblCity) {
		this.lblCity = lblCity;
	}
	
	 public String getStreet() {
			return street;
		}
	 
	 public String getlblStreet() {
			return lblStreet;
		}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setlblStreet(String lblStreet) {
		this.lblStreet = lblStreet;
	}
	
	 public String getApNr() {
			return apNr;
		}
	 
	 public String getlblApNr() {
			return lblApNr;
		}
	public void setApNr(String apNr) {
		this.apNr = apNr;
	}
	
	public void setlblApNr(String lblApNr) {
		this.lblApNr = lblApNr;
	}
	
	 public String getZipCode() {
			return zipCode;
		}
	 
	 public String getlblZipCode() {
			return lblZipCode;
		}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setlblZipCode(String lblZipCode) {
		this.lblZipCode = lblZipCode;
	}
	
	public String getGroup() {
		return group;
	}
	
	public String getlblGroup() {
		return lblGroup;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	public void setlblGroup(String lblGroup) {
		this.lblGroup = lblGroup;
	}
	
	public String getComents(){
		return coments;
	}
	
	public String getlblComents(){
		return lblComents;
	}
	public void setComents(String coments) {
		this.coments = coments;
	}
	
	public void setlblComents(String lblComents) {
		this.lblComents = lblComents;
	}
	
	public Object getImage(){
		  return image;
	  }
	  
	  public void setImage(Image image){
		  this.image = image;
		  
	  }

	public Printing() {
		
	}
	
	public static void printComponent(Component c) {
	    new Printing(c).print();
	  }
	  
	  public Printing(Component componentToBePrinted) {
		    this.componentToBePrinted = componentToBePrinted;
		 
	  }
	  
	  
	  
	  public void print() {
		    PrinterJob printJob = PrinterJob.getPrinterJob();
		    printJob.setPrintable(this);
		    if (printJob.printDialog())
		      try {
		        printJob.print();
		      } catch(PrinterException pe) {
		        System.out.println("Error printing: " + pe);
		      }
	  }
	  
	  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
		    if (pageIndex > 0) {
		      return(NO_SUCH_PAGE);
		    } else {
		      Graphics2D g2d = (Graphics2D)g;
		     
		      g2d.drawString(lblFirstName, 100,100);
		      g2d.drawString(firstName, 180, 100);
		      g2d.drawString(lblLastName, 100, 120);
		      g2d.drawString(lastName, 180, 120);
		      g2d.drawString(lblDateOfBirth, 85, 140);
		      g2d.drawString(dateOfBirth, 180, 140);
		      
		      g2d.drawString(lblMobileNr, 106, 170);
		      g2d.drawString(mobileNr, 180, 170);
		      g2d.drawString(lblPhoneNr, 108, 190);
		      g2d.drawString(phoneNr, 180, 190);
		      g2d.drawString(lblFaxNr, 138, 210);
		      g2d.drawString(faxNr, 180, 210);
		      g2d.drawString(lblEmailAdd, 128, 230);
		      g2d.drawString(emailAdd, 180, 230);
		      
		      g2d.drawString(lblCountry, 113, 260);
		      g2d.drawString(country, 180, 260);
		      g2d.drawString(lblCity, 137, 280);
		      g2d.drawString(city, 180, 280);
		      g2d.drawString("Address:", 108, 310);
		      g2d.drawString(lblStreet, 170, 300);
		      g2d.drawString(street, 170, 320);
		      g2d.drawString(lblApNr, 250, 300);
		      g2d.drawString(apNr, 250, 320);
		      
		      g2d.drawString(lblZipCode, 108, 340);
		      g2d.drawString(zipCode, 180, 340);
		      g2d.drawString(lblGroup, 120, 360);
		      g2d.drawString(group, 170, 360);
		      
		      g2d.drawString(lblComents, 105, 380);
		      g2d.drawString(coments, 180, 380);
		     
			g2d.drawImage(image, 350, 100, 70, 90, componentToBePrinted);
		      
		      g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
		      disableDoubleBuffering(componentToBePrinted);
		     // componentToBePrinted.paint(g2d);
		      
		      enableDoubleBuffering(componentToBePrinted);
		      //componentToBePrinted.paintAll(g2d);
		      return(PAGE_EXISTS);
		    }
	  }
	  
	  public static void disableDoubleBuffering(Component c) {
		    RepaintManager currentManager = RepaintManager.currentManager(c);
		    currentManager.setDoubleBufferingEnabled(false);
	  }
	  
	  public static void enableDoubleBuffering(Component c) {
		    RepaintManager currentManager = RepaintManager.currentManager(c);
		    currentManager.setDoubleBufferingEnabled(true);
	  }
	
	}