package my.api

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class ApiErrorResourceService {
    
    def create(ApiError dto) {
        dto.save()
    }

    def read(def id) {
        def obj = ApiError.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(ApiError.class, id)
        }
        obj
    }
    
    def readAll() {
        ApiError.findAll()
    }
    
    def update(ApiError dto) {
        def obj = ApiError.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(ApiError.class, dto.id)
        }
        obj.properties = dto.properties 
        obj
    }
    
    void delete(def id) {
        def obj = ApiError.get(id)
        if (obj) { 
            obj.delete()
        }
    }
    
}

