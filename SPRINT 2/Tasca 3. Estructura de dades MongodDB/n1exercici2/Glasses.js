db.createCollection('Glasses', {validator: {$jsonSchema: {bsonType: 'object',title: 'Glasses',required: ['Info','Bought_by'],properties:{Info:{bsonType: 'object',title: 'object',required: ['Brand','Frame','Supplier','Price'],properties:{Brand:{bsonType: 'string'},Frame:{enum: ['Floating', 'Paste', 'Metallic']},Supplier:{bsonType: 'object',title: 'object',required: ['Name','Address','Telephone','NIF'],properties:{Name:{bsonType: 'string'},Address:{bsonType: 'object',title: 'object',required: ['Street','Postal_code','City','Country'],properties:{Street:{bsonType: 'string'},Number:{bsonType: 'int'},Floor:{bsonType: 'int'},Door:{bsonType: 'int'},Postal_code:{bsonType: 'int'},City:{bsonType: 'string'},Country:{bsonType: 'string'}}},Telephone:{bsonType: 'int'},Fax:{bsonType: 'int'},NIF:{bsonType: 'string'}}},Price:{bsonType: 'decimal'}}},Bought_by:{bsonType: 'array',items:{title: 'object',required: ['Customer'],properties:{Customer:{bsonType: 'objectId'}}}}}}}});