// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PersonalLineAllDataReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PersonalLineAllDataReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PersonalLineAllDataReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PersonalLineAllDataReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PersonalLineAllDataReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cPersonalLineAllDataReq.proto\"\u0018\n\u0016PersonalLineAllDataReqB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PersonalLineAllDataReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PersonalLineAllDataReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PersonalLineAllDataReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_descriptor, new String[0]);
    }
    
    public static final class PersonalLineAllDataReq extends GeneratedMessageV3 implements PersonalLineAllDataReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private byte memoizedIsInitialized;
        private static final PersonalLineAllDataReq DEFAULT_INSTANCE;
        private static final Parser<PersonalLineAllDataReq> PARSER;
        
        private PersonalLineAllDataReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PersonalLineAllDataReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PersonalLineAllDataReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PersonalLineAllDataReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalLineAllDataReq.class, Builder.class);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PersonalLineAllDataReq)) {
                return super.equals(obj);
            }
            final PersonalLineAllDataReq other = (PersonalLineAllDataReq)obj;
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PersonalLineAllDataReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data);
        }
        
        public static PersonalLineAllDataReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PersonalLineAllDataReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PersonalLineAllDataReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataReq.PARSER, input);
        }
        
        public static PersonalLineAllDataReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataReq.PARSER, input, extensionRegistry);
        }
        
        public static PersonalLineAllDataReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalLineAllDataReq.PARSER, input);
        }
        
        public static PersonalLineAllDataReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PersonalLineAllDataReq.PARSER, input, extensionRegistry);
        }
        
        public static PersonalLineAllDataReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataReq.PARSER, input);
        }
        
        public static PersonalLineAllDataReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PersonalLineAllDataReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PersonalLineAllDataReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PersonalLineAllDataReq prototype) {
            return PersonalLineAllDataReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PersonalLineAllDataReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PersonalLineAllDataReq getDefaultInstance() {
            return PersonalLineAllDataReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PersonalLineAllDataReq> parser() {
            return PersonalLineAllDataReq.PARSER;
        }
        
        @Override
        public Parser<PersonalLineAllDataReq> getParserForType() {
            return PersonalLineAllDataReq.PARSER;
        }
        
        @Override
        public PersonalLineAllDataReq getDefaultInstanceForType() {
            return PersonalLineAllDataReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PersonalLineAllDataReq();
            PARSER = new AbstractParser<PersonalLineAllDataReq>() {
                @Override
                public PersonalLineAllDataReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PersonalLineAllDataReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PersonalLineAllDataReqOrBuilder
        {
            public static final Descriptors.Descriptor getDescriptor() {
                return PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PersonalLineAllDataReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PersonalLineAllDataReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PersonalLineAllDataReqOuterClass.internal_static_PersonalLineAllDataReq_descriptor;
            }
            
            @Override
            public PersonalLineAllDataReq getDefaultInstanceForType() {
                return PersonalLineAllDataReq.getDefaultInstance();
            }
            
            @Override
            public PersonalLineAllDataReq build() {
                final PersonalLineAllDataReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PersonalLineAllDataReq buildPartial() {
                final PersonalLineAllDataReq result = new PersonalLineAllDataReq(this);
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof PersonalLineAllDataReq) {
                    return this.mergeFrom((PersonalLineAllDataReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PersonalLineAllDataReq other) {
                if (other == PersonalLineAllDataReq.getDefaultInstance()) {
                    return this;
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                PersonalLineAllDataReq parsedMessage = null;
                try {
                    parsedMessage = PersonalLineAllDataReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PersonalLineAllDataReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PersonalLineAllDataReqOrBuilder extends MessageOrBuilder
    {
    }
}
