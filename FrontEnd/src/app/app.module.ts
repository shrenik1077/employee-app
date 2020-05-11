import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { TechnologyService } from './services/technology.service';
import { EmployeeService } from './services/employee.service';
import { TechnologyComponent } from './technology/technology.component';
import { EmployeeComponent } from './employee/employee.component';


@NgModule({
  declarations: [
    AppComponent,
    TechnologyComponent,
    EmployeeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    TechnologyService,
    EmployeeService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
