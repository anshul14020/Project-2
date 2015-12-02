<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="NewFile">
<table border="0" cellpadding="10">
	
	<tr>
		<td>Personal Information*</td>
	</tr>
	<tr>
		<td>Email*</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Name*</td>
		<td><input type="text" name="name"/></td>
	</tr>
	<tr>
		<td>Enrollment Number*</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Address of Correspondence*</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Mobile*</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Address of Correspondence*</td>
		<td><input type="text"/></td>
	</tr>
	
	<tr>
		<td>PhD Stream*</td>
		<td><input type="radio" name="phd" value="male"/> Computer Science
			<input type="radio" name="phd" value="female"/> Electronics And Communications
			<input type="radio" name="phd" value="female"/> Computational Biology</td>
	</tr>
	
	<tr>
		<td>PhD Area Preference 1*</td>
		<td><select>
				<option value="default1">--------</option>
				<option value="Artificial">Artificial Intelligence and Robotics -CSE</option>
				<option value="Bio">Biophysics -CB</option>
				<option value="Compilers">Compilers -CSE</option>
				<option value="CASDECE">Computer Architecture and Design -ECE</option>
				<option value="CASDCSE">Computer Architecture and Design -CSE</option>
				<option value="CompGraphics">Computer Graphics -CSE</option>
				<option value="CompVision">Computer Vision -CSE</option>
				<option value="Controls">Controls And Robotics -ECE</option>
				<option value="DigitalAnalog">Digital and Analog VLSI Systems Design-ECE</option>
				<option value="Electromagnetics">Electromagnetics -ECE</option>
				<option value="EmbeddedVLSI">Embedded and VLSI systems Design -ECE</option>
				<option value="Embeddedsystems">Embedded Systems -ECE</option>
				<option value="Fiber">Fiber-Wireless Architectures-ECE</option>
				<option value="Image">Image Analysis and Biometrics -CSE</option>
				<option value="InformationM">Information Management and Data Engineering -CSE</option>
				<option value="MachineCSE">Machine Learning -CSE</option>
				<option value="MachineECE">Machine Learning -ECE</option>
				<option value="Massive">Massively Parallel Systems-CSE</option>
				<option value="MobileCSE">Mobile Computing and Networking Applications-CSE</option>
				<option value="OFDM">OFDM based Optical Access</option>
				<option value="Optical">Optical Wireless Communication Systems-ECE</option>
				<option value="Program">Program Analysis-CSE</option>
				<option value="RF">RF and mixed signal electronics-ECE</option>
				<option value="Security">Security and Privacy</option>
				<option value="SignalECE">Signal and Image Processing-ECE</option>
				<option value="SignalCSE">Signal and Image Processing-CSE</option>
				<option value="Software">Software and Engineering-CSE</option>
				<option value="Structural">Structural Biology-CB</option>
				<option value="Systems">Systems Biology-CB</option>
				<option value="Theory">Theoretical Computer Science-CSE</option>
				<option value="WirelessCommECE">Wireless Communication -ECE</option>
				<option value="WirelessNetworkECE">Wireless Networks -ECE</option>
				<option value="WirelessNetworkCSE">Wireless Networks -CSE</option>
			
			</select></td>
	</tr>
	<tr>
		<td>PhD Area Preference 2</td>
		<td><select>
				<option value="default1">--------</option>
				<option value="Artificial">Artificial Intelligence and Robotics -CSE</option>
				<option value="Bio">Biophysics -CB</option>
				<option value="Compilers">Compilers -CSE</option>
				<option value="CASDECE">Computer Architecture and Design -ECE</option>
				<option value="CASDCSE">Computer Architecture and Design -CSE</option>
				<option value="CompGraphics">Computer Graphics -CSE</option>
				<option value="CompVision">Computer Vision -CSE</option>
				<option value="Controls">Controls And Robotics -ECE</option>
				<option value="DigitalAnalog">Digital and Analog VLSI Systems Design-ECE</option>
				<option value="Electromagnetics">Electromagnetics -ECE</option>
				<option value="EmbeddedVLSI">Embedded and VLSI systems Design -ECE</option>
				<option value="Embeddedsystems">Embedded Systems -ECE</option>
				<option value="Fiber">Fiber-Wireless Architectures-ECE</option>
				<option value="Image">Image Analysis and Biometrics -CSE</option>
				<option value="InformationM">Information Management and Data Engineering -CSE</option>
				<option value="MachineCSE">Machine Learning -CSE</option>
				<option value="MachineECE">Machine Learning -ECE</option>
				<option value="Massive">Massively Parallel Systems-CSE</option>
				<option value="MobileCSE">Mobile Computing and Networking Applications-CSE</option>
				<option value="OFDM">OFDM based Optical Access</option>
				<option value="Optical">Optical Wireless Communication Systems-ECE</option>
				<option value="Program">Program Analysis-CSE</option>
				<option value="RF">RF and mixed signal electronics-ECE</option>
				<option value="Security">Security and Privacy</option>
				<option value="SignalECE">Signal and Image Processing-ECE</option>
				<option value="SignalCSE">Signal and Image Processing-CSE</option>
				<option value="Software">Software and Engineering-CSE</option>
				<option value="Structural">Structural Biology-CB</option>
				<option value="Systems">Systems Biology-CB</option>
				<option value="Theory">Theoretical Computer Science-CSE</option>
				<option value="WirelessCommECE">Wireless Communication -ECE</option>
				<option value="WirelessNetworkECE">Wireless Networks -ECE</option>
				<option value="WirelessNetworkCSE">Wireless Networks -CSE</option>
			
			</select></td>
	</tr>
	<tr>
		<td>PhD Area Preference 3</td>
		<td><select>
				<option value="default1">--------</option>
				<option value="Artificial">Artificial Intelligence and Robotics -CSE</option>
				<option value="Bio">Biophysics -CB</option>
				<option value="Compilers">Compilers -CSE</option>
				<option value="CASDECE">Computer Architecture and Design -ECE</option>
				<option value="CASDCSE">Computer Architecture and Design -CSE</option>
				<option value="CompGraphics">Computer Graphics -CSE</option>
				<option value="CompVision">Computer Vision -CSE</option>
				<option value="Controls">Controls And Robotics -ECE</option>
				<option value="DigitalAnalog">Digital and Analog VLSI Systems Design-ECE</option>
				<option value="Electromagnetics">Electromagnetics -ECE</option>
				<option value="EmbeddedVLSI">Embedded and VLSI systems Design -ECE</option>
				<option value="Embeddedsystems">Embedded Systems -ECE</option>
				<option value="Fiber">Fiber-Wireless Architectures-ECE</option>
				<option value="Image">Image Analysis and Biometrics -CSE</option>
				<option value="InformationM">Information Management and Data Engineering -CSE</option>
				<option value="MachineCSE">Machine Learning -CSE</option>
				<option value="MachineECE">Machine Learning -ECE</option>
				<option value="Massive">Massively Parallel Systems-CSE</option>
				<option value="MobileCSE">Mobile Computing and Networking Applications-CSE</option>
				<option value="OFDM">OFDM based Optical Access</option>
				<option value="Optical">Optical Wireless Communication Systems-ECE</option>
				<option value="Program">Program Analysis-CSE</option>
				<option value="RF">RF and mixed signal electronics-ECE</option>
				<option value="Security">Security and Privacy</option>
				<option value="SignalECE">Signal and Image Processing-ECE</option>
				<option value="SignalCSE">Signal and Image Processing-CSE</option>
				<option value="Software">Software and Engineering-CSE</option>
				<option value="Structural">Structural Biology-CB</option>
				<option value="Systems">Systems Biology-CB</option>
				<option value="Theory">Theoretical Computer Science-CSE</option>
				<option value="WirelessCommECE">Wireless Communication -ECE</option>
				<option value="WirelessNetworkECE">Wireless Networks -ECE</option>
				<option value="WirelessNetworkCSE">Wireless Networks -CSE</option>
			
			</select></td>
	</tr>
	
	
	<tr>
		<td>Father's Name*</td>
		<td><input type="text"/></td>
	</tr>
	
	<tr>
		<td>Permanent Address*</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Pin Code</td>
		<td><input type="text"/></td>
	</tr>
	<tr>
		<td>Nationality*</td>
			<td><select>
				<option value="India">India</option>
				<option value="Australia">Australia</option>
				<option value="Argentina">Argentina</option>
				<option value="Spain">Spain</option>
				<option value="Antartica">Antartica</option>
			</select></td>
	</tr>
	
	
	<tr>
		<td>Children/War Widows of Defence Peronnel killed/Disabled in Action*</td>
		<td><input type="radio" name="war" value="male"/> Yes
			<input type="radio" name="war" value="female"/> No</td>
	</tr>
	
	<tr>
		<td>Category*</td>
		<td><select>
				<option value="all">All</option>
				<option value="general">General</option>
				<option value="sc">SC</option>
				<option value="st">ST</option>
				<option value="obc">OBC</option>
			</select></td>
	</tr>
	<tr>
		<td>Gender*</td>
		<td><input type="radio" name="gender" value="male"/> Male
			<input type="radio" name="gender" value="female"/> Female</td>
	</tr>

	<tr>
		<td>Physically Disabled*</td>
		<td><input type="radio" name="disabled" value="yes"/> Yes
			<input type="radio" name="disabled" value="no"/> No</td>
	</tr>
	<tr>
		<td>Date of Birth*</td>
		<td><input type="radio" name="dob" value="before"/> Before
			<input type="radio" name="dob" value="on"/> On
			<input type="radio" name="dob" value="after"/> After</td>
	</tr>
		<td></td>
		<td><input type="date" /></td>
	</tr>
	
	</tr>
		<td></td>
		<input type="submit" value="save"/>

	</tr>
	

</table>
<% /*
for(int i=0;i<10;i++){
	out.print(i+"<br>");
}
String p = "Palash"; */
%>
</form>
</body>
</html>