// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ClientGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ClientGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ClientGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ClientGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ClientGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016ClientGadgetInfo.proto\"\u00c5\u0001\n\u0010ClientGadgetInfo\u0012\u000f\n\u0007camp_id\u0018\u0001 \u0001(\r\u0012\u0011\n\tcamp_type\u0018\u0002 \u0001(\r\u0012\f\n\u0004guid\u0018\u0003 \u0001(\u0004\u0012\u0017\n\u000fowner_entity_id\u0018\u0004 \u0001(\r\u0012\u0018\n\u0010target_entity_id\u0018\u0005 \u0001(\r\u0012\u0012\n\nasync_load\u0018\u0006 \u0001(\b\u0012\u001b\n\u0013Unk2700_JBOPENAGGAF\u0018\u0007 \u0001(\b\u0012\u001b\n\u0013Unk2700_BELOIHEIEAN\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ClientGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ClientGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ClientGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor, new String[] { "CampId", "CampType", "Guid", "OwnerEntityId", "TargetEntityId", "AsyncLoad", "Unk2700JBOPENAGGAF", "Unk2700BELOIHEIEAN" });
    }
    
    public static final class ClientGadgetInfo extends GeneratedMessageV3 implements ClientGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CAMP_ID_FIELD_NUMBER = 1;
        private int campId_;
        public static final int CAMP_TYPE_FIELD_NUMBER = 2;
        private int campType_;
        public static final int GUID_FIELD_NUMBER = 3;
        private long guid_;
        public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 4;
        private int ownerEntityId_;
        public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 5;
        private int targetEntityId_;
        public static final int ASYNC_LOAD_FIELD_NUMBER = 6;
        private boolean asyncLoad_;
        public static final int UNK2700_JBOPENAGGAF_FIELD_NUMBER = 7;
        private boolean unk2700JBOPENAGGAF_;
        public static final int UNK2700_BELOIHEIEAN_FIELD_NUMBER = 8;
        private Internal.IntList unk2700BELOIHEIEAN_;
        private int unk2700BELOIHEIEANMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ClientGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<ClientGadgetInfo> PARSER;
        
        private ClientGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2700BELOIHEIEANMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ClientGadgetInfo() {
            this.unk2700BELOIHEIEANMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ClientGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ClientGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            this.campId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.campType_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 32: {
                            this.ownerEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.targetEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.asyncLoad_ = input.readBool();
                            continue;
                        }
                        case 56: {
                            this.unk2700JBOPENAGGAF_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700BELOIHEIEAN_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2700BELOIHEIEAN_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk2700BELOIHEIEAN_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientGadgetInfo.class, Builder.class);
        }
        
        @Override
        public int getCampId() {
            return this.campId_;
        }
        
        @Override
        public int getCampType() {
            return this.campType_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getOwnerEntityId() {
            return this.ownerEntityId_;
        }
        
        @Override
        public int getTargetEntityId() {
            return this.targetEntityId_;
        }
        
        @Override
        public boolean getAsyncLoad() {
            return this.asyncLoad_;
        }
        
        @Override
        public boolean getUnk2700JBOPENAGGAF() {
            return this.unk2700JBOPENAGGAF_;
        }
        
        @Override
        public List<Integer> getUnk2700BELOIHEIEANList() {
            return this.unk2700BELOIHEIEAN_;
        }
        
        @Override
        public int getUnk2700BELOIHEIEANCount() {
            return this.unk2700BELOIHEIEAN_.size();
        }
        
        @Override
        public int getUnk2700BELOIHEIEAN(final int index) {
            return this.unk2700BELOIHEIEAN_.getInt(index);
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
            this.getSerializedSize();
            if (this.campId_ != 0) {
                output.writeUInt32(1, this.campId_);
            }
            if (this.campType_ != 0) {
                output.writeUInt32(2, this.campType_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(3, this.guid_);
            }
            if (this.ownerEntityId_ != 0) {
                output.writeUInt32(4, this.ownerEntityId_);
            }
            if (this.targetEntityId_ != 0) {
                output.writeUInt32(5, this.targetEntityId_);
            }
            if (this.asyncLoad_) {
                output.writeBool(6, this.asyncLoad_);
            }
            if (this.unk2700JBOPENAGGAF_) {
                output.writeBool(7, this.unk2700JBOPENAGGAF_);
            }
            if (this.getUnk2700BELOIHEIEANList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.unk2700BELOIHEIEANMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2700BELOIHEIEAN_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2700BELOIHEIEAN_.getInt(i));
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
            if (this.campId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.campId_);
            }
            if (this.campType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.campType_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.guid_);
            }
            if (this.ownerEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.ownerEntityId_);
            }
            if (this.targetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.targetEntityId_);
            }
            if (this.asyncLoad_) {
                size += CodedOutputStream.computeBoolSize(6, this.asyncLoad_);
            }
            if (this.unk2700JBOPENAGGAF_) {
                size += CodedOutputStream.computeBoolSize(7, this.unk2700JBOPENAGGAF_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.unk2700BELOIHEIEAN_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2700BELOIHEIEAN_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2700BELOIHEIEANList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2700BELOIHEIEANMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientGadgetInfo)) {
                return super.equals(obj);
            }
            final ClientGadgetInfo other = (ClientGadgetInfo)obj;
            return this.getCampId() == other.getCampId() && this.getCampType() == other.getCampType() && this.getGuid() == other.getGuid() && this.getOwnerEntityId() == other.getOwnerEntityId() && this.getTargetEntityId() == other.getTargetEntityId() && this.getAsyncLoad() == other.getAsyncLoad() && this.getUnk2700JBOPENAGGAF() == other.getUnk2700JBOPENAGGAF() && this.getUnk2700BELOIHEIEANList().equals(other.getUnk2700BELOIHEIEANList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCampId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCampType();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getOwnerEntityId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getTargetEntityId();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getAsyncLoad());
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700JBOPENAGGAF());
            if (this.getUnk2700BELOIHEIEANCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getUnk2700BELOIHEIEANList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ClientGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static ClientGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static ClientGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static ClientGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ClientGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ClientGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientGadgetInfo.PARSER, input);
        }
        
        public static ClientGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static ClientGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientGadgetInfo.PARSER, input);
        }
        
        public static ClientGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ClientGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static ClientGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientGadgetInfo.PARSER, input);
        }
        
        public static ClientGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ClientGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ClientGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ClientGadgetInfo prototype) {
            return ClientGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ClientGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ClientGadgetInfo getDefaultInstance() {
            return ClientGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ClientGadgetInfo> parser() {
            return ClientGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<ClientGadgetInfo> getParserForType() {
            return ClientGadgetInfo.PARSER;
        }
        
        @Override
        public ClientGadgetInfo getDefaultInstanceForType() {
            return ClientGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ClientGadgetInfo();
            PARSER = new AbstractParser<ClientGadgetInfo>() {
                @Override
                public ClientGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ClientGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientGadgetInfoOrBuilder
        {
            private int bitField0_;
            private int campId_;
            private int campType_;
            private long guid_;
            private int ownerEntityId_;
            private int targetEntityId_;
            private boolean asyncLoad_;
            private boolean unk2700JBOPENAGGAF_;
            private Internal.IntList unk2700BELOIHEIEAN_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ClientGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.campId_ = 0;
                this.campType_ = 0;
                this.guid_ = 0L;
                this.ownerEntityId_ = 0;
                this.targetEntityId_ = 0;
                this.asyncLoad_ = false;
                this.unk2700JBOPENAGGAF_ = false;
                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
            }
            
            @Override
            public ClientGadgetInfo getDefaultInstanceForType() {
                return ClientGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public ClientGadgetInfo build() {
                final ClientGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ClientGadgetInfo buildPartial() {
                final ClientGadgetInfo result = new ClientGadgetInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.campId_ = this.campId_;
                result.campType_ = this.campType_;
                result.guid_ = this.guid_;
                result.ownerEntityId_ = this.ownerEntityId_;
                result.targetEntityId_ = this.targetEntityId_;
                result.asyncLoad_ = this.asyncLoad_;
                result.unk2700JBOPENAGGAF_ = this.unk2700JBOPENAGGAF_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2700BELOIHEIEAN_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2700BELOIHEIEAN_ = this.unk2700BELOIHEIEAN_;
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
                if (other instanceof ClientGadgetInfo) {
                    return this.mergeFrom((ClientGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ClientGadgetInfo other) {
                if (other == ClientGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCampId() != 0) {
                    this.setCampId(other.getCampId());
                }
                if (other.getCampType() != 0) {
                    this.setCampType(other.getCampType());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                if (other.getOwnerEntityId() != 0) {
                    this.setOwnerEntityId(other.getOwnerEntityId());
                }
                if (other.getTargetEntityId() != 0) {
                    this.setTargetEntityId(other.getTargetEntityId());
                }
                if (other.getAsyncLoad()) {
                    this.setAsyncLoad(other.getAsyncLoad());
                }
                if (other.getUnk2700JBOPENAGGAF()) {
                    this.setUnk2700JBOPENAGGAF(other.getUnk2700JBOPENAGGAF());
                }
                if (!other.unk2700BELOIHEIEAN_.isEmpty()) {
                    if (this.unk2700BELOIHEIEAN_.isEmpty()) {
                        this.unk2700BELOIHEIEAN_ = other.unk2700BELOIHEIEAN_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2700BELOIHEIEANIsMutable();
                        this.unk2700BELOIHEIEAN_.addAll(other.unk2700BELOIHEIEAN_);
                    }
                    this.onChanged();
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
                ClientGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = ClientGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ClientGadgetInfo)e.getUnfinishedMessage();
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
            public int getCampId() {
                return this.campId_;
            }
            
            public Builder setCampId(final int value) {
                this.campId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCampId() {
                this.campId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCampType() {
                return this.campType_;
            }
            
            public Builder setCampType(final int value) {
                this.campType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCampType() {
                this.campType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final long value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOwnerEntityId() {
                return this.ownerEntityId_;
            }
            
            public Builder setOwnerEntityId(final int value) {
                this.ownerEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerEntityId() {
                this.ownerEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetEntityId() {
                return this.targetEntityId_;
            }
            
            public Builder setTargetEntityId(final int value) {
                this.targetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetEntityId() {
                this.targetEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getAsyncLoad() {
                return this.asyncLoad_;
            }
            
            public Builder setAsyncLoad(final boolean value) {
                this.asyncLoad_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAsyncLoad() {
                this.asyncLoad_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700JBOPENAGGAF() {
                return this.unk2700JBOPENAGGAF_;
            }
            
            public Builder setUnk2700JBOPENAGGAF(final boolean value) {
                this.unk2700JBOPENAGGAF_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700JBOPENAGGAF() {
                this.unk2700JBOPENAGGAF_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700BELOIHEIEANIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.mutableCopy(this.unk2700BELOIHEIEAN_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2700BELOIHEIEANList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2700BELOIHEIEAN_) : this.unk2700BELOIHEIEAN_;
            }
            
            @Override
            public int getUnk2700BELOIHEIEANCount() {
                return this.unk2700BELOIHEIEAN_.size();
            }
            
            @Override
            public int getUnk2700BELOIHEIEAN(final int index) {
                return this.unk2700BELOIHEIEAN_.getInt(index);
            }
            
            public Builder setUnk2700BELOIHEIEAN(final int index, final int value) {
                this.ensureUnk2700BELOIHEIEANIsMutable();
                this.unk2700BELOIHEIEAN_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2700BELOIHEIEAN(final int value) {
                this.ensureUnk2700BELOIHEIEANIsMutable();
                this.unk2700BELOIHEIEAN_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2700BELOIHEIEAN(final Iterable<? extends Integer> values) {
                this.ensureUnk2700BELOIHEIEANIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2700BELOIHEIEAN_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700BELOIHEIEAN() {
                this.unk2700BELOIHEIEAN_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface ClientGadgetInfoOrBuilder extends MessageOrBuilder
    {
        int getCampId();
        
        int getCampType();
        
        long getGuid();
        
        int getOwnerEntityId();
        
        int getTargetEntityId();
        
        boolean getAsyncLoad();
        
        boolean getUnk2700JBOPENAGGAF();
        
        List<Integer> getUnk2700BELOIHEIEANList();
        
        int getUnk2700BELOIHEIEANCount();
        
        int getUnk2700BELOIHEIEAN(final int p0);
    }
}
