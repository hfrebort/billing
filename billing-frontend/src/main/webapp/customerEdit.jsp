<!doctype html>
<html ng-app>
  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.0/angular.min.js"></script>
  
    <title> customerEdit </title>
  </head>




<div class="col-sm">
<div data-ng-controller="CustomerController as ctrl">

<table>
  <tbody>
    <tr>
      <td> KD-Nummer:  </td>
      <td> <input id="customerId" class="form-control" type="text" data-ng-model="customer.customerId" placeholder="Kundennummer"> </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Vorname:  </td>
      <td> <input id="firstName" class="form-control" type="text" data-ng-model="customer.firstName" placeholder="Vorname"> </td>
      <td> Telefon:  </td>
      <td> <input id="phone" class="form-control" type="text" data-ng-model="customer.phone" placeholder="Tel"> </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Nachname:  </td>
      <td> <input id="lastName" class="form-control" type="text" data-ng-model="customer.lastName" placeholder="Nachname"> </td>
      <td> Mobilnummer 1: </td>
      <td> <input id="mobile" class="form-control" type="text" data-ng-model="customer.mobile" placeholder="Mobil1"> </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Firma: *  </td>
      <td> <input id="company" class="form-control" type="text" data-ng-model="customer.company" placeholder="Firma" data-ng-required ="true"> </td>
      <td> Mobilnummer 2: </td>
      <td> <input id="mobileAlternative" class="form-control" type="text" data-ng-model="customer.mobileAlternative" placeholder="Mobil2"> </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Firmenzusatz:  </td>
      <td> <input id="companyExtension" class="form-control" type="text" data-ng-model="customer.companyExtension" placeholder="Firmenzusatz"> </td>
      <td> Email-Adresse: </td>
      <td> <input id="email" class="form-control" type="text" data-ng-model="customer.email" placeholder="Email1">  </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Adresse: *  </td>
      <td> <input id="address" class="form-control" type="text" data-ng-model="customer.address" placeholder="Adresse" data-ng-required ="true"> </td>
      <td> Email-Adresse: </td>
      <td> <input id="emailAlternative" class="form-control" type="text" data-ng-model="customer.emailAlternative" placeholder="Email2"> </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Postleitzahl: *  </td>
      <td> <input id="zipCode" class="form-control" type="text" data-ng-model="customer.zipCode" placeholder="PLZ" data-ng-required ="true"> </td>
      <td> Homepage: </td>
      <td> <input id="website" class="form-control" type="text" data-ng-model="customer.website" placeholder="Homepage"> </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Ort: *  </td>
      <td> <input id="city" class="form-control" type="text" data-ng-model="customer.city" placeholder="Ort" data-ng-required ="true"> </td>
      <td> Versicherung: </td>
      <td> <input id="insurance" class="form-control" type="text" data-ng-model="customer.insurace" placeholder="Versicherung"> </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Land/Region:  </td>
      <td> <input id="region" class="form-control" type="text" data-ng-model="customer.region" placeholder="Land/Region"> </td>
      <td> UID-Nummer: </td>
      <td> <input id="vatNumber" class="form-control" type="text" data-ng-model="customer.vatNumber" placeholder="UID-Nummer"> </td>
    </tr>
  </tbody>
    <tbody>
    <tr>
      <td> Anrede:  </td>
      <td> <input id="salutation" class="form-control" type="text" data-ng-model="customer.salutation" placeholder="Anrede"> </td>
      <td> Zahlungsziel: </td>
      <td> <input id="paymentDate" class="form-control" type="text" data-ng-model="customer.paymentDate" placeholder="Zahlungsziel"> </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td> Titel:  </td>
      <td> <input id="title" class="form-control" type="text" data-ng-model="customer.title" placeholder="Titel"> </td>
      <td> Mahnsperre: </td>
      <td>  <select id="reminderLock" class="form-control">
        		<option selected>Kunde wird gemahnt</option>
        		<option>Kunde wird nicht gemahnt</option>
      		</select> 
      </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td>  </td>
      <td>  </td>
      <td> Archiviert: </td>
      <td> 
        <input class="form-check-input" type="checkbox" id="archived">
      </td>
      <td>  </td>
    </tr>
  </tbody>
  <tbody>
    <tr>
      <td colspan="5"> <div class="form-group">
        <label for="exampleFormControlTextarea1">Bemerkungen:</label>
         <textarea class="form-control" id="remark" rows="4" data-ng-model="customer.remark" placeholder="Bemerkung"></textarea>
      </div> 
      </td>
    </tr>
  </tbody>  
</table>

</div>
</div>


</html>
  	  