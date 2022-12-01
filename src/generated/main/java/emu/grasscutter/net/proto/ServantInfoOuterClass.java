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

public final class ServantInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServantInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServantInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServantInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServantInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011ServantInfo.proto\"@\n\u000bServantInfo\u0012\u0018\n\u0010master_entity_id\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fborn_slot_index\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServantInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ServantInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServantInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServantInfoOuterClass.internal_static_ServantInfo_descriptor, new String[] { "MasterEntityId", "BornSlotIndex" });
    }
    
    public static final class ServantInfo extends GeneratedMessageV3 implements ServantInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MASTER_ENTITY_ID_FIELD_NUMBER = 1;
        private int masterEntityId_;
        public static final int BORN_SLOT_INDEX_FIELD_NUMBER = 2;
        private int bornSlotIndex_;
        private byte memoizedIsInitialized;
        private static final ServantInfo DEFAULT_INSTANCE;
        private static final Parser<ServantInfo> PARSER;
        
        private ServantInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ServantInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServantInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServantInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.masterEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.bornSlotIndex_ = input.readUInt32();
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
            return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ServantInfo.class, Builder.class);
        }
        
        @Override
        public int getMasterEntityId() {
            return this.masterEntityId_;
        }
        
        @Override
        public int getBornSlotIndex() {
            return this.bornSlotIndex_;
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
            if (this.masterEntityId_ != 0) {
                output.writeUInt32(1, this.masterEntityId_);
            }
            if (this.bornSlotIndex_ != 0) {
                output.writeUInt32(2, this.bornSlotIndex_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.masterEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.masterEntityId_);
            }
            if (this.bornSlotIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.bornSlotIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServantInfo)) {
                return super.equals(obj);
            }
            final ServantInfo other = (ServantInfo)obj;
            return this.getMasterEntityId() == other.getMasterEntityId() && this.getBornSlotIndex() == other.getBornSlotIndex() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMasterEntityId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getBornSlotIndex();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServantInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data);
        }
        
        public static ServantInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServantInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data);
        }
        
        public static ServantInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServantInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data);
        }
        
        public static ServantInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServantInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServantInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServantInfo.PARSER, input);
        }
        
        public static ServantInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServantInfo.PARSER, input, extensionRegistry);
        }
        
        public static ServantInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServantInfo.PARSER, input);
        }
        
        public static ServantInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServantInfo.PARSER, input, extensionRegistry);
        }
        
        public static ServantInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServantInfo.PARSER, input);
        }
        
        public static ServantInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServantInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServantInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServantInfo prototype) {
            return ServantInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServantInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServantInfo getDefaultInstance() {
            return ServantInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServantInfo> parser() {
            return ServantInfo.PARSER;
        }
        
        @Override
        public Parser<ServantInfo> getParserForType() {
            return ServantInfo.PARSER;
        }
        
        @Override
        public ServantInfo getDefaultInstanceForType() {
            return ServantInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServantInfo();
            PARSER = new AbstractParser<ServantInfo>() {
                @Override
                public ServantInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServantInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServantInfoOrBuilder
        {
            private int masterEntityId_;
            private int bornSlotIndex_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ServantInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServantInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.masterEntityId_ = 0;
                this.bornSlotIndex_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
            }
            
            @Override
            public ServantInfo getDefaultInstanceForType() {
                return ServantInfo.getDefaultInstance();
            }
            
            @Override
            public ServantInfo build() {
                final ServantInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServantInfo buildPartial() {
                final ServantInfo result = new ServantInfo(this);
                result.masterEntityId_ = this.masterEntityId_;
                result.bornSlotIndex_ = this.bornSlotIndex_;
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
                if (other instanceof ServantInfo) {
                    return this.mergeFrom((ServantInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServantInfo other) {
                if (other == ServantInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getMasterEntityId() != 0) {
                    this.setMasterEntityId(other.getMasterEntityId());
                }
                if (other.getBornSlotIndex() != 0) {
                    this.setBornSlotIndex(other.getBornSlotIndex());
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
                ServantInfo parsedMessage = null;
                try {
                    parsedMessage = ServantInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServantInfo)e.getUnfinishedMessage();
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
            public int getMasterEntityId() {
                return this.masterEntityId_;
            }
            
            public Builder setMasterEntityId(final int value) {
                this.masterEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMasterEntityId() {
                this.masterEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBornSlotIndex() {
                return this.bornSlotIndex_;
            }
            
            public Builder setBornSlotIndex(final int value) {
                this.bornSlotIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBornSlotIndex() {
                this.bornSlotIndex_ = 0;
                this.onChanged();
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
    
    public interface ServantInfoOrBuilder extends MessageOrBuilder
    {
        int getMasterEntityId();
        
        int getBornSlotIndex();
    }
}
