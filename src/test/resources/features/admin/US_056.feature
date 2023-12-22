Feature: Bir yonetici (admin) olarak tum deposit islemlerini bir sayfada goruntuleyebilmek icin All Deposit sayfasinin olmasini istiyorum.
@ra
  Scenario: TC
  Listeden seçilen tamamlanmayan para çekme işleminin detay sayfasında 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status' bilgileri görüntülenmelidir.
  Deposits menu basligi altindaki "All Deposits" sayfa linkine tiklandiginda "admin/deposit" sayfasina erisilmelidir.
  Sayfada search box ve Start Date - End Date search box görünür ve aktif olmalı
  Acilan sayfada 'Successful Deposit','Pending Deposit','Rejected Deposit','Initiated Deposit' özet box'ları görünür ve aktif olmalı.Tıklandığında ilgili sayfaya ve listeye yönlendirmelidir.
  Sayfada Deposit History listesi görüntülenmeli,listede 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' başlıkları ve altındaki bilgiler görünür olmalıdır.
  Listeden Seçilen 'Status=Pending' olan depositin detayına ulaşmak ve onaylamak /reddetmek için için 'Details' butonu görünür ve aktif olmalıdır.
  Onaylama/Reddetme işlemi başarılı olduğunda uyarı mesajı görüntülenmelidir.
  Listeden seçilen 'Status=Approved' olan depositin detayına ulaşmak için 'Details' butonu görünür ve aktif olmalıdır.Tıklandığında açılan sayfada Deposit detay başlıkları ve içeriği görüntülenebilmelidir.

    Given Given kullanici verilen "adminUrl" gider
    Then kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    And admin Deposits linkine tiklar
    Then admin Pending Deposits linkine tiklar
    And admin Details butonuna tiklar
    Then Details sayfasindaki bilgilerin goruntulendigi dogrulanir
    And All Deposits linkine tiklar
    Then admin mevcut sayfa uzantisinin "admin/deposit" oldugunu dogrular
    And search box ve Start Date - End Date search box görünür ve aktif olmalı
    Then Successful Deposit','Pending Deposit','Rejected Deposit','Initiated Deposit' özet box'ları görünür ve aktif olmalı tiklanabilmeli
    And admin Deposits listesinin goruntulenebilir oldugunu dogrular
    Then admin Details butonun gorunur ve aktif oldugunu dogrular