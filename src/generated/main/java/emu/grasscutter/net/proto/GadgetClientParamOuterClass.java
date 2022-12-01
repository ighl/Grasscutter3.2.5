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
import com.google.protobuf.Internal;
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

public final class GadgetClientParamOuterClass
{
    private static final Descriptors.Descriptor internal_static_GadgetClientParam_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GadgetClientParam_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetClientParamOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetClientParamOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017GadgetClientParam.proto\"\u0085\u0001\n\u0011GadgetClientParam\u0012\u000e\n\u0006campId\u0018\u0001 \u0001(\r\u0012\u0010\n\bcampType\u0018\u0002 \u0001(\r\u0012\f\n\u0004guid\u0018\u0003 \u0001(\u0004\u0012\u0015\n\rownerEntityId\u0018\u0004 \u0001(\r\u0012\u0016\n\u000etargetEntityId\u0018\u0005 \u0001(\r\u0012\u0011\n\tasyncLoad\u0018\u0006 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetClientParamOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GadgetClientParam_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GadgetClientParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GadgetClientParamOuterClass.internal_static_GadgetClientParam_descriptor, new String[] { "CampId", "CampType", "Guid", "OwnerEntityId", "TargetEntityId", "AsyncLoad" });
    }
    
    public static final class GadgetClientParam extends GeneratedMessageV3 implements GadgetClientParamOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CAMPID_FIELD_NUMBER = 1;
        private int campId_;
        public static final int CAMPTYPE_FIELD_NUMBER = 2;
        private int campType_;
        public static final int GUID_FIELD_NUMBER = 3;
        private long guid_;
        public static final int OWNERENTITYID_FIELD_NUMBER = 4;
        private int ownerEntityId_;
        public static final int TARGETENTITYID_FIELD_NUMBER = 5;
        private int targetEntityId_;
        public static final int ASYNCLOAD_FIELD_NUMBER = 6;
        private boolean asyncLoad_;
        private byte memoizedIsInitialized;
        private static final GadgetClientParam DEFAULT_INSTANCE;
        private static final Parser<GadgetClientParam> PARSER;
        
        private GadgetClientParam(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GadgetClientParam() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GadgetClientParam();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GadgetClientParam(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return GadgetClientParamOuterClass.internal_static_GadgetClientParam_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GadgetClientParamOuterClass.internal_static_GadgetClientParam_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetClientParam.class, Builder.class);
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
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GadgetClientParam)) {
                return super.equals(obj);
            }
            final GadgetClientParam other = (GadgetClientParam)obj;
            return this.getCampId() == other.getCampId() && this.getCampType() == other.getCampType() && this.getGuid() == other.getGuid() && this.getOwnerEntityId() == other.getOwnerEntityId() && this.getTargetEntityId() == other.getTargetEntityId() && this.getAsyncLoad() == other.getAsyncLoad() && this.unknownFields.equals(other.unknownFields);
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
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GadgetClientParam parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data);
        }
        
        public static GadgetClientParam parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetClientParam parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data);
        }
        
        public static GadgetClientParam parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetClientParam parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data);
        }
        
        public static GadgetClientParam parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetClientParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetClientParam parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetClientParam.PARSER, input);
        }
        
        public static GadgetClientParam parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetClientParam.PARSER, input, extensionRegistry);
        }
        
        public static GadgetClientParam parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetClientParam.PARSER, input);
        }
        
        public static GadgetClientParam parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetClientParam.PARSER, input, extensionRegistry);
        }
        
        public static GadgetClientParam parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetClientParam.PARSER, input);
        }
        
        public static GadgetClientParam parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetClientParam.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GadgetClientParam.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GadgetClientParam prototype) {
            return GadgetClientParam.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GadgetClientParam.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GadgetClientParam getDefaultInstance() {
            return GadgetClientParam.DEFAULT_INSTANCE;
        }
        
        public static Parser<GadgetClientParam> parser() {
            return GadgetClientParam.PARSER;
        }
        
        @Override
        public Parser<GadgetClientParam> getParserForType() {
            return GadgetClientParam.PARSER;
        }
        
        @Override
        public GadgetClientParam getDefaultInstanceForType() {
            return GadgetClientParam.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GadgetClientParam();
            PARSER = new AbstractParser<GadgetClientParam>() {
                @Override
                public GadgetClientParam parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GadgetClientParam(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GadgetClientParamOrBuilder
        {
            private int campId_;
            private int campType_;
            private long guid_;
            private int ownerEntityId_;
            private int targetEntityId_;
            private boolean asyncLoad_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GadgetClientParamOuterClass.internal_static_GadgetClientParam_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GadgetClientParamOuterClass.internal_static_GadgetClientParam_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetClientParam.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GadgetClientParam.alwaysUseFieldBuilders) {}
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
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GadgetClientParamOuterClass.internal_static_GadgetClientParam_descriptor;
            }
            
            @Override
            public GadgetClientParam getDefaultInstanceForType() {
                return GadgetClientParam.getDefaultInstance();
            }
            
            @Override
            public GadgetClientParam build() {
                final GadgetClientParam result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GadgetClientParam buildPartial() {
                final GadgetClientParam result = new GadgetClientParam(this);
                result.campId_ = this.campId_;
                result.campType_ = this.campType_;
                result.guid_ = this.guid_;
                result.ownerEntityId_ = this.ownerEntityId_;
                result.targetEntityId_ = this.targetEntityId_;
                result.asyncLoad_ = this.asyncLoad_;
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
                if (other instanceof GadgetClientParam) {
                    return this.mergeFrom((GadgetClientParam)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GadgetClientParam other) {
                if (other == GadgetClientParam.getDefaultInstance()) {
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
                GadgetClientParam parsedMessage = null;
                try {
                    parsedMessage = GadgetClientParam.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GadgetClientParam)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GadgetClientParamOrBuilder extends MessageOrBuilder
    {
        int getCampId();
        
        int getCampType();
        
        long getGuid();
        
        int getOwnerEntityId();
        
        int getTargetEntityId();
        
        boolean getAsyncLoad();
    }
}
