

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewFile
 */
@WebServlet("/NewFile")
public class NewFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Pls Work");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email,name,eno,address1,mobile,comp1,phd1,phd2,phd3;
		String father,address3,pincode,nationality,war1,category,gender1,disabled1;
		String date,tenth1,tenthmarks1,yeartenth,twelfth1,twelfthmarks1,yeartwelfth;
		String degree1,department1,college1,university1,city1,state1,yeargrad1;
		String cgpa11,cgpaselected1,cgpatotal1,marks111,firstoption,phd111;
		String phd222,phd333,phd444,secondoption,degreedown1,thesisdown,departmentdown1;
		String collegedown1,citydown1,statedown1,yeargraddown1,cgpadown1,cgpadown111;
		String cgpatotaldown111,marksdown1,thirdoption,examnamedown1,subjectdown1,scoredown1;
		String rankdown1,yeargraddown2,fourthoption,areadown1,marksdown2,scoredown2;
		String rankdown2,yeargraddown3,cvsop;
		
		String files1,files2;
		int fff=0;
		// also are you applying for ece phd, then drop down that also has to be included in the project but has not been included as of yet by me
		email=(String) request.getParameter("email");
		name=(String) request.getParameter("name");
		address1=(String) request.getParameter("address1");
		mobile=(String) request.getParameter("mobile");
		comp1=(String) request.getParameter("comp1");
		phd1=(String) request.getParameter("phd1");
		if(phd1.equals("-----"))
		{
			fff=1;
		}
		phd2=(String) request.getParameter("phd2");
		phd3=(String) request.getParameter("phd3");
		gender1=(String) request.getParameter("gender1");
		category=(String) request.getParameter("category");
		disabled1=(String) request.getParameter("disabled1");
		date=(String) request.getParameter("disabled1");
		war1=(String) request.getParameter("war1");
		father=(String) request.getParameter("father");
		nationality=(String) request.getParameter("nationality");
		if(nationality.equals("-----"))
		{
			fff=1;
		}
		address3=(String) request.getParameter("address3");
		pincode=(String) request.getParameter("pincode");
		tenth1=(String) request.getParameter("tenth1");
		tenthmarks1=(String) request.getParameter("tenthmarks1");
		yeartenth=(String) request.getParameter("yeartenth");
		if(yeartenth.equals("-----"))
		{
			fff=1;
		}
		twelfth1=(String) request.getParameter("twelfth1");
		twelfthmarks1=(String) request.getParameter("twelfthmarks1");
		yeartwelfth=(String) request.getParameter("yeartwelfth");
		if(yeartwelfth.equals("-----"))
		{
			fff=1;
		}
		degree1=(String) request.getParameter("degree1");
		department1=(String) request.getParameter("department1");
		college1=(String) request.getParameter("college1");
		university1=(String) request.getParameter("university1");
		city1=(String) request.getParameter("city1");
		state1=(String) request.getParameter("state1");
		if(state1.equals("-----"))
		{
			fff=1;
		}
		yeargrad1=(String) request.getParameter("yeargrad1");
		if(yeargrad1.equals("-----"))
		{
			fff=1;
		}
		cgpa11=(String) request.getParameter("cgpa11");
		if(cgpa11.equals("CGPA"))
		{
			cgpaselected1=(String) request.getParameter("cgpaselected1");
			cgpatotal1=(String) request.getParameter("cgpatotal1");
			if(cgpaselected1.equals("-----") || cgpatotal1.equals("-----"))
			{
				fff=1;
			}
		}
		else
		{
			marks111=(String) request.getParameter("marks111");
			if(marks111.equals(""))
			{
				fff=1;
			}
		}
		firstoption=(String) request.getParameter("firstoption");
		secondoption=(String) request.getParameter("secondoption");
		thirdoption=(String) request.getParameter("thirdoption");
		fourthoption=(String) request.getParameter("fourthoption");
		System.out.println(firstoption);
		
		if(firstoption!=null)
		{
			//System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
			phd111=(String) request.getParameter("phd111");
			phd222=(String) request.getParameter("phd222");
			phd333=(String) request.getParameter("phd333");
			phd444=(String) request.getParameter("phd444");
			if(phd111.equals("-----") || phd222.equals("-----") || phd333.equals("-----"))
			{
				fff=1;
			}
		}
		if(secondoption!=null)
		{
			int ggg=0;
			collegedown1=(String) request.getParameter("collegedown1");
			citydown1=(String) request.getParameter("citydown1");
			statedown1=(String) request.getParameter("statedown1");
			departmentdown1=(String) request.getParameter("departmentdown1");
			degreedown1=(String) request.getParameter("degreedown1");
			thesisdown=(String) request.getParameter("thesisdown1");
			yeargraddown1=(String) request.getParameter("yeargraddown1");
			if(yeargraddown1.equals("-----"))
			{
				fff=1;
			}
			cgpadown1=(String) request.getParameter("cgpadown1");
			if(cgpadown1.equals("CGPA"))
			{
				cgpadown111=(String) request.getParameter("cgpadown111");
				cgpatotaldown111=(String) request.getParameter("cgpatotaldown111");
				if(cgpadown111.equals("-----") || cgpatotaldown111.equals("-----"))
				{
					ggg=1;
				}
			}
			else
			{
				marksdown1=(String) request.getParameter("marksdown1");
				if(marksdown1.equals(""))
				{
					ggg=1;
				}
			}
		}
		if(thirdoption!=null)
		{
			examnamedown1=(String) request.getParameter("examnamedown1");
			subjectdown1=(String) request.getParameter("subjectdown1");
			yeargraddown2=(String) request.getParameter("yeargraddown2");
			if(yeargraddown2.equals("-----"))
			{
				fff=1;
			}
			scoredown1=(String) request.getParameter("scoredown1");
			//System.out.println("42"+scoredown1);
			rankdown1=(String) request.getParameter("rankdown1");
		}
		if(fourthoption!=null)
		{
			areadown1=(String) request.getParameter("areadown1");
			yeargraddown3=(String) request.getParameter("yeargraddown3");
			if(yeargraddown3.equals("-----"))
			{
				fff=1;
			}
			marksdown2=(String) request.getParameter("marksdown2");
			scoredown2=(String) request.getParameter("scoredown2");
			rankdown2=(String) request.getParameter("rankdown2");
		}
		cvsop=(String) request.getParameter("cvsop");
		if(cvsop.equals(""))
		{
			fff=1;
		}
		PrintWriter out=response.getWriter();
		if(fff==1)
		{
			out.print("<html>Please press back and type correctly as the information you typed was not right</html>");
		}
		if(fff==0)
		{
			out.print("<html>Filled !! <form action='Applicant.html'> <input type= 'submit' >Submit</form></html>");
			BufferedWriter o=null;
	        try {
	            File file = new File("/Users/anshulgaur/Desktop/workspace3/employee.txt");
	            o= new BufferedWriter(new FileWriter(file,true));
	            o.write(email);o.write(",");
	            o.write(name);o.write(",");
	            o.write(address1);o.write(",");
	            o.write(mobile);o.write(",");
	            o.write(comp1);o.write(",");
	            o.write(phd1);o.write(",");
	            if(phd2.equals("-----"))
		            {
	            	o.write("");o.write(",");
		            }
		            else
		            	{
		            	o.write(phd2);o.write(",");
		            	}
	            if(phd3.equals("-----"))
	            {
	            	o.write("");o.write(",");
	            }
	            else
	            	{
	            	o.write(phd3);o.write(",");
	            	}
	        	o.write(gender1);o.write(",");
	        	o.write(category);o.write(",");
	        	o.write(disabled1);o.write(",");
	        	o.write(date);o.write(",");
	        	
	        	o.write(war1);o.write(",");
	        	o.write(father);o.write(",");
	        	
	        	o.write(nationality);o.write(",");
	        	o.write(address3);o.write(",");
	        	o.write(pincode);o.write(",");
	        	o.write(tenth1);o.write(",");
	        	o.write(tenthmarks1);o.write(",");
	        	o.write(yeartenth);o.write(",");
	        	o.write(twelfth1);o.write(",");
	        	o.write(twelfthmarks1);o.write(",");
	        	o.write(yeartwelfth);o.write(",");
	        	o.write(degree1);o.write(",");
	        	o.write(department1);o.write(",");
	        	o.write(college1);o.write(",");
	        	o.write(university1);o.write(",");
	        	o.write(city1);o.write(",");
	        	o.write(state1);o.write(",");
	        	o.write(yeargrad1);o.write(",");
	        	if(cgpa11.equals("CGPA"))
	    		{
	        		o.write("CGPA:");
	    			cgpaselected1=(String) request.getParameter("cgpaselected1");
	    			o.write(cgpaselected1);o.write(",");
	    		}
	    		else
	    		{
	    			marks111=(String) request.getParameter("marks111");
	    			o.write("Marks:");
	    			o.write(marks111);o.write(",");
	    		}
	        	if(firstoption==null)
	        		{
	        			o.write("No");o.write(",");
	        			o.write("");o.write(",");
	        			o.write("");o.write(",");
	        			o.write("");o.write(",");
	        			o.write("");o.write(",");
	        		}
	        		
	        		if(firstoption!=null)
	        		{
	        			o.write("Yes");o.write(",");
	        			phd111=(String) request.getParameter("phd111");
	        			o.write(phd111);o.write(",");
		    			phd222=(String) request.getParameter("phd222");
		    			o.write(phd222);o.write(",");
		    			phd333=(String) request.getParameter("phd333");
		    			o.write(phd333);o.write(",");
		    			phd444=(String) request.getParameter("phd444");
		    			if(phd444.equals("-----"))
		    				{o.write("");o.write(",");
		    				}
		    				else{
		    					o.write(phd444);o.write(",");
		    				}
	        		}
		        	
		        		
		        		
	        	if(secondoption==null){
	   	        	o.write("No");o.write(",");
		   
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
        			o.write("");o.write(",");
		       
	        	}
	        	if(secondoption!=null)
	        	{
	        		o.write("Yes");o.write(",");
	        		int ggg=0;
	        		degreedown1=(String) request.getParameter("degreedown1");
	        		departmentdown1=(String) request.getParameter("departmentdown1");
	    			
	        		collegedown1=(String) request.getParameter("collegedown1");
	        		thesisdown=(String) request.getParameter("thesisdown1");
	    			
	        		citydown1=(String) request.getParameter("citydown1");
	    			statedown1=(String) request.getParameter("statedown1");
	    			o.write(degreedown1);o.write(",");
	    			o.write(departmentdown1);o.write(",");
	    			o.write(collegedown1);o.write(",");
	    			o.write(thesisdown);o.write(",");
	    			o.write(citydown1);o.write(",");
	    			o.write(statedown1);o.write(",");
	    			
	    			yeargraddown1=(String) request.getParameter("yeargraddown1");
	    			if(yeargraddown1.equals("-----"))
	    			{
	    				o.write("");o.write(",");
	    			}
	    			else
	    			{
	    				o.write(yeargraddown1);o.write(",");
	    			}
	    		   	
	    			cgpadown1=(String) request.getParameter("cgpadown1");
	    			if(cgpadown1.equals("CGPA"))
	    			{
	    				o.write("CGPA:");
	    				cgpadown111=(String) request.getParameter("cgpadown111");
	    				if(cgpadown111.equals("-----"))
	    				{
	    					o.write("");o.write(",");
		    				
	    				}
	    				else
	    				{
	    					o.write(cgpadown111);o.write(",");
		    					
	    				}
	    			}
	    			else
	    			{
	    				o.write("Marks:");
	    				
	    				marksdown1=(String) request.getParameter("marksdown1");
	    				if(marksdown1.equals(""))
	    				{
	    					o.write("");o.write(",");
		    			}
	    				else
	    				{
	    					o.write(marksdown1);o.write(",");
	    				}
	    			}
	        		
	        	}
		        if(thirdoption==null){
		        	
		        
			  		o.write("No");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
		        }
		        if(thirdoption!=null)
			  		{
		        	o.write("Yes");o.write(",");
		        	o.write("");o.write(","); // check this please
		        	examnamedown1=(String) request.getParameter("examnamedown1");
	    			o.write("examnamedown1");o.write(",");
		        	subjectdown1=(String) request.getParameter("subjectdown1");
	    			o.write("subjectdown1");o.write(",");

		        	yeargraddown2=(String) request.getParameter("yeargraddown2");
	    			o.write("yeargraddown2");o.write(",");

	    			scoredown1=(String) request.getParameter("scoredown1");
	    			o.write("scoredown1");o.write(",");

	    			//System.out.println("42"+scoredown1);
	    			rankdown1=(String) request.getParameter("rankdown1");
	    			o.write("rankdown1");o.write(",");

			  		}
		        if(fourthoption==null)
	      			{
		        	o.write("No");o.write(",");

			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
			  		o.write("");o.write(",");
	      			}
	      		
		      		if(fourthoption!=null){
		      			o.write("Yes");o.write(",");
		    			areadown1=(String) request.getParameter("areadown1");
		    			o.write(areadown1);o.write(",");
		    			yeargraddown3=(String) request.getParameter("yeargraddown3");
		    			o.write(yeargraddown3);o.write(",");
		    			marksdown2=(String) request.getParameter("marksdown2");
		    			o.write(marksdown2);o.write(",");
		    			scoredown2=(String) request.getParameter("scoredown2");
		    			o.write(scoredown2);o.write(",");
		    			rankdown2=(String) request.getParameter("rankdown2");
		    			o.write(rankdown2);o.write(",");
		      		}				
				        	
	        		
	    		cvsop=(String) request.getParameter("cvsop");
	    		o.write(cvsop);o.write(",");
	    		String ttt=new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
	    		//System.out.println(ttt);	    		
	            char c=ttt.charAt(0);
	            char cc=ttt.charAt(1);
	            char ccc=ttt.charAt(2);
	            char ccccc=ttt.charAt(3);
	            o.write(c);
	            o.write(cc);
	            o.write(ccc);
	            o.write(ccccc);
	            o.write("-");
	            char g=ttt.charAt(4);
	            char gg=ttt.charAt(5);
	            if(g=='0' && gg=='1')
	            {
	            	String por="Jan";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='2')
	            {
	            	String por="Feb";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='3')
	            {
	            	String por="Mar";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='4')
	            {
	            	String por="Apr";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='5')
	            {
	            	String por="May";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='6')
	            {
	            	String por="Jun";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='7')
	            {
	            	String por="Jul";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='8')
	            {
	            	String por="Aug";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='0' && gg=='9')
	            {
	            	String por="Sep";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='1' && gg=='0')
	            {
	            	String por="Oct";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='1' && gg=='1')
	            {
	            	String por="Nov";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            else if(g=='1' && gg=='2')
	            {
	            	String por="Dec";
	            	o.write(por);
	            	o.write("-");
	            	o.write(ttt.charAt(6));
	            	o.write(ttt.charAt(7));
	            	
	            }
	            o.write(",");
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } finally {
	            if ( o!= null )
					try {
						o.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        }
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
