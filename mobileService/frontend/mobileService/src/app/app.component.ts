import { Component } from '@angular/core';
import {MatIconRegistry} from "@angular/material/icon";
import {DomSanitizer} from "@angular/platform-browser";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private matIconRegistry: MatIconRegistry,
              private domSanitizer: DomSanitizer) {

    this.matIconRegistry.addSvgIcon(
      'battery-60',
      this.domSanitizer.bypassSecurityTrustResourceUrl(
        '../assets/icons/battery-60.svg'
      )
    );

    this.matIconRegistry.addSvgIcon(
      'iphone13promax',
      this.domSanitizer.bypassSecurityTrustResourceUrl(
        '../assets/icons/iphone13promax.svg'
      )
    );

  }
  title = 'mobileService';
}
