
  Feature: Bir yonetici (admin) kullanici tarafindan baslatilan ama tamamlanmamis deposit isteklerini goruntuleyebilmek icin Initiated Deposit sayfasini goruntuleyebilmelidir
    Scenario: TC_017 Deposits menu basligi altindaki "Initiated Deposits" sayfa linkine tiklandiginda "admin/deposit/initiated" sayfasina erisilmelidir
    Scenario: TC_018 Sayfada Initiated Deposits listesi görüntülenmeli,listede 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' başlıkları ve altındaki bilgiler görünür olmalıdır
    Scenario: TC_019 Rejected olan depositin detayına ulaşmak için Details buton görünür ve aktif olmalıdır
    Scenario: TC_020 Listeden seçilen tamamlanmayan para çekme işleminin detay sayfasında 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status' bilgileri görüntülenmelidir
