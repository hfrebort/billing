<head>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<title> customerEdit </title>

</head>

<table>
  <tbody>
    <tr>
      <td> KD-Nummer:  </td>
      <td> <input id="customerId" class="form-control" type="text" > </td>
      <td>  </td>
      <td>  </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Vorname:  </td>
      <td> <input id="firstName" class="form-control" type="text" value="${customer.firstName}"> </td>
      <td> Telefon:  </td>
      <td> <input id="phone" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Zuname:  </td>
      <td> <input id="lastName" class="form-control" type="text" value="${customer.firstName}"> </td>
      <td> Mobilnummer 1: </td>
      <td> <input id="mobile" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Firma: *  </td>
      <td> <input id="company" class="form-control" type="text" > </td>
      <td> Mobilnummer 2: </td>
      <td> <input id="mobileAlternative" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Firmenzusatz:  </td>
      <td> <input id="companyExtension" class="form-control" type="text" > </td>
      <td> Email-Adresse: </td>
      <td> <input id="email" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Adresse: *  </td>
      <td> <input id="address" class="form-control" type="text" > </td>
      <td> Email-Adresse: </td>
      <td> <input id="emailAlternative" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Postleitzahl: *  </td>
      <td> <input id="zipCode" class="form-control" type="text" > </td>
      <td> Homepage: </td>
      <td> <input id="website" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Ort: *  </td>
      <td> <input id="city" class="form-control" type="text" > </td>
      <td> Versicherung: </td>
      <td> <input id="insurance" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Land/Region:  </td>
      <td> <input id="region" class="form-control" type="text" > </td>
      <td> UID-Nummer: </td>
      <td> <input id="vatNumber" class="form-control" type="text"> </td>
      <td>  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Anrede:  </td>
      <td> <input id="salutation" class="form-control" type="text" > </td>
      <td> Zahlungsziel: </td>
      <td> <input id="paymentDate" class="form-control" type="text" value="28"> </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Titel:  </td>
      <td> <input id="title" class="form-control" type="text" > </td>
      <td> Mahnsperre: </td>
      <td>  <select id="reminderLock" class="form-control">
        		<option selected>Kunde wird gemahnt</option>
        		<option>Kunde wird nicht gemahnt</option>
      		</select> 
      </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td>  </td>
      <td>  </td>
      <td> Anzeigen: </td>
      <td> 
        <input class="form-check-input" type="checkbox" id="archived">
      </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td colspan="4"> <div class="form-group">
        <label for="exampleFormControlTextarea1">Bemerkungen:</label>
         <textarea class="form-control" id="remark" rows="5"></textarea>
      </div> 
      </td>
    </tr>
  </tbody>

  
</table>
  	  