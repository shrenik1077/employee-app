import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Technology } from '../common/technology';

@Injectable({
  providedIn: 'root'
})
export class TechnologyService {

  private baseUrl = "http://localhost:4949/api/technologies";

  constructor(private httpClient:HttpClient) { 

  }

  getTechnology():Observable<Technology[]>{
    return this.httpClient.get<GetResponseTechnology>(this.baseUrl).pipe(
      map(response => response._embedded.technologies)
    );
  }
}

interface GetResponseTechnology{
  _embedded:{
    technologies:Technology[];
  }
}
