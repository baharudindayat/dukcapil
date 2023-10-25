# API CONTRACT DUKCAPIL

## Validation Ktp

```http
  POST /dukcapil/ktp/validate
```
* Url Params
  None
* Headers
  Content-Type: application/json

#### Request :
```
  {
    "nik":"202310251436190000018"
  }
```
#### Response Succes
```
  {
      "data": {
          "nik": "20231025143619000001",
          "alamat": "123 Main Street",
          "nama": "John Doe",
          "pekerjaan": "Engineer"
      },
      "message": "KTP Valid",
      "status": 200
  }
```
#### Response Not Found
```
  {
    "message": "NIK Tidak Ditemukan",
    "status": "NOT_FOUND"
  }
```
