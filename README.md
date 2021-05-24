# HRMS API Back-End

**H**uman **R**esource **M**anagement **S**ystem back-end api yazılımı Java ile yazılmış, Spring Framework ile güçlendirilmiştir.

<a href="https://github.com/mertkarakulak/HrmsProject/tree/main/src/main/java/com/kodlamaio/hrms"> <img width=18 src="https://r.resimlink.com/QKL2.png"> Main Directory </a>

<a href="https://github.com/mertkarakulak/HrmsProject/blob/main/dbhrms.sql"> <img width=17 src="https://r.resimlink.com/Yosz.png"> PostgreSQL</a>

Spring - JavaSE-16.0.1 (JRE) based.

(Beta Version: 1.1)



## Katmanlar

- **Business** : Projemizin iş katmanıdır. Gerekli iş kuralları; Veri kontrolleri, Validasyonlar, IoC Container'lar ve yetki kontrolleri için yazılmış katmandır.
- **Core** : Projenin çekirdek katmanı olup içerisinde evrensel operasyonlar barındırmaktadır..
- **DataAccess** : Projede veritabanımız ile bağlantımızı kurduğumuz katmanımızdır.
- **Entities** : Projede veritabanındaki tablolarımızın projemizde nesne olarak kullanılması için oluşturulmuş olup, içerisinde DTO nesneleri de yer almaktadır.
- **WebAPI** : Projenin Restful API katmanıdır. İçerisinde kullanılan metodlar; Get, Post, Put, Delete metodlarıdır.

## Spring Framework Dependencies
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Lombok

## Veri Tabanı Şeması
![HRMS Veri Tabanı Şeması](https://raw.githubusercontent.com/mertkarakulak/HrmsProject/main/gitimages/drawSQL.png?token=AIOW4X6PUOWHWHIUGN6HN53AVACWQ)

## Örnek API Çıktısı
![HRMS API Çıktısı](https://raw.githubusercontent.com/mertkarakulak/HrmsProject/main/gitimages/jpGetAll.png?token=AIOW4X3K6VFPIYAPIBASGDDAVAC44)
