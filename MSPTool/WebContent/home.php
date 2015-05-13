<html>
<head>
	<title>MSP Home Page</title>
	<style>
		html, body
		{
			margin:0;
			padding:0;
			font-size:5px;
		}
		
		body,fieldset
		{
			font-size:12px;
		}	
		#header,#footer
		{
			width:100%;
			height:100px;
			background:white;
			margin:0;
		}
		
		
		#outerSection
		{
			background:white;
			margin-left:5%;
			margin-right:5%;
			margin-top:10px;
			margin-bottom:5%;
			border: 2px solid #e0e0e0;
			border-radius: 5px;
			height:400px;
			width:90%;
		}
		
		#marqueDate
		{
			width: 100%;
			height: 25px;
			background: black;
			color: white;
			font-size: 17px;
			text-align: center;
			vertical-align: middle;
			padding-top: 5px;
			font-weight: bold;
		}
		
		#upperHeader
		{
			height:10px;
			color:white;
			padding-top:3px;
			text-align:left;
			font-size:12px;
		}
		
		div#rightSection
		{
			float:right;
			width:350px;
			
			
		}
		div#upperActions
		{
			margin-top:20px;
			padding:10px;
		}
		div#upperHeader
		{
			height: 17px;
			background: black;
			font-size: 12px;
			font-weight: bold;
			padding-left: 5px;
			margin-bottom:5px;
			
		}
		
		#leftSection
		{
			float:left;
			width:300px;
			height:300px;
		}
		
		a
		{
			font-size:16px;
		}
		
		#netappLogo
		{
			height:90px;
			width:100px;
			margin:5px;
			float:left;
		
		}
		
		#myHeading
		{
			font-size: 36px;
			width: auto;
			display: inline-block;
			float: left;
			margin-top: 27px;
			margin-left: 108px;
		}
		
		#line
		{
			width:100%;
			height:10px;
			background:grey;
		}
	</style>
	
</head>
<body>
	<div id="header">
		<img src="images/netappLogo.jpeg" id="netappLogo" />
		<div id="myHeading">IT Finance Accruals September - 2014</div>
	</div>
	<div id="line"></div>
	<div id="outerSection">
		<div id="marqueDate">
			All changes must be in by: 24th September, 2014.
		</div>
		
		<div id="leftSection">
		
			<a id="getData" href="grid.php">Accruals Datasheet</a>
			
			<br/>
			<br/>
			
			<br/>
			<br/>
			<br/>
			<br/>
			
			<a href="#">Export Modifier Tracker Details</a>
			<br/>
			<br/>
			<a href="#">Export My Modifier Tracker Table</a>
			<br/>
			<br/>
			<br/>
			<br/>
			
			<form>
			  <fieldset>
				<legend>Historicals:</legend>
				Period: <input type="text"><br>  <a href="#">Export</a>
			<br/>
				
			  </fieldset>
			</form>
			
			<br/>
			
			<br/>
			Status :- Database is currently in Read-only mode.
		
		</div>
		<div id="rightSection">
			
			<div id="upperActions">
				<div id="upperHeader">
					Administrator
				</div>
				<input type="button" id="setDate" name="setDate" value="Set CutOff Date" /><br/>
				<br/>
				<select id="Vendor">
					<option>IT</option>
					<option>Finance</option>
					<option>Marketing</option>
				</select>
				
				<input type="button" id="setDate" name="setDate" value="Manage Tables" />
				<input type="button" id="setDate" name="setDate" value="Pull Record" />
				<br/>
				<br/>
				
				<input type="button" id="setDate" name="setDate" value="Import Vendors" />
				<input type="button" id="setDate" name="setDate" value="Archive Accruals" />
				<br/>
				<br/>
				<input type="button" id="setDate" name="setDate" value="Export" />
				<input type="button" id="setDate" name="setDate" value="Remove" />
				<br/>
				<br/>
				<input type="button" id="setDate" name="setDate" value="Generate JV" />
				<br/>
				<br/>
				<input type="button" id="setDate" name="setDate" value="Clear Database" />
			</div>
			
		</div>
	
	</div>
	<div id="line"></div>
	<div id="footer">
		
	</div>

</body>
</html>