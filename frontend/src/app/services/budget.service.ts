import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Budget } from '../models/budget';

@Injectable({
  providedIn: 'root'
})
export class BudgetService {

  constructor(private http : HttpClient) { }

  private apiUrl = 'http://localhost:8080/budget';

  getAll():Observable<Budget[]>{
    return this.http.get<Budget[]>(this.apiUrl);
  }

  getbyId(id:number): Observable<Budget>{
    return this.http.get<Budget>(`${this.apiUrl}/${id}`);
  }

  create(categorie : Budget):Observable<Budget>{
    return this.http.post<Budget>(this.apiUrl, categorie);
  }

  update(id:number, categorie:Budget):Observable<Budget>{
    return this.http.put<Budget>(`${this.apiUrl}/${id}`, categorie)
  }

  delete(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
