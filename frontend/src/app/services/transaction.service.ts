import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Transaction } from '../models/transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  // constructor(private http : HttpClient) { }
  private http = inject(HttpClient);
  private apiURL = "http://localhost:8080/transaction";

  getAll():Observable<Transaction[]>{
    return this.http.get<Transaction[]>(this.apiURL);
  }

  getById(id:number):Observable<Transaction>{
    return this.http.get<Transaction>(`${this.apiURL}/${id}`);
  }

  add(transaction:Transaction):Observable<Transaction>{
    return this.http.post<Transaction>(this.apiURL, transaction);
  }

  update(id:number, transaction:Transaction):Observable<Transaction>{
    return this.http.put<Transaction>(`${this.apiURL}/${id}`, transaction);
  }

  delete(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiURL}/${id}`);
  }
}
