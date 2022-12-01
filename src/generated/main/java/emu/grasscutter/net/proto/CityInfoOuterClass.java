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

public final class CityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_CityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eCityInfo.proto\"?\n\bCityInfo\u0012\u000f\n\u0007city_id\u0018\u000f \u0001(\r\u0012\u0013\n\u000bcrystal_num\u0018\u0003 \u0001(\r\u0012\r\n\u0005level\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CityInfoOuterClass.internal_static_CityInfo_descriptor, new String[] { "CityId", "CrystalNum", "Level" });
    }
    
    public static final class CityInfo extends GeneratedMessageV3 implements CityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CITY_ID_FIELD_NUMBER = 15;
        private int cityId_;
        public static final int CRYSTAL_NUM_FIELD_NUMBER = 3;
        private int crystalNum_;
        public static final int LEVEL_FIELD_NUMBER = 4;
        private int level_;
        private byte memoizedIsInitialized;
        private static final CityInfo DEFAULT_INSTANCE;
        private static final Parser<CityInfo> PARSER;
        
        private CityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CityInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.crystalNum_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.cityId_ = input.readUInt32();
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
            return CityInfoOuterClass.internal_static_CityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CityInfoOuterClass.internal_static_CityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityInfo.class, Builder.class);
        }
        
        @Override
        public int getCityId() {
            return this.cityId_;
        }
        
        @Override
        public int getCrystalNum() {
            return this.crystalNum_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
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
            if (this.crystalNum_ != 0) {
                output.writeUInt32(3, this.crystalNum_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(4, this.level_);
            }
            if (this.cityId_ != 0) {
                output.writeUInt32(15, this.cityId_);
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
            if (this.crystalNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.crystalNum_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.level_);
            }
            if (this.cityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.cityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CityInfo)) {
                return super.equals(obj);
            }
            final CityInfo other = (CityInfo)obj;
            return this.getCityId() == other.getCityId() && this.getCrystalNum() == other.getCrystalNum() && this.getLevel() == other.getLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getCityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCrystalNum();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data);
        }
        
        public static CityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data);
        }
        
        public static CityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data);
        }
        
        public static CityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CityInfo.PARSER, input);
        }
        
        public static CityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CityInfo.PARSER, input, extensionRegistry);
        }
        
        public static CityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CityInfo.PARSER, input);
        }
        
        public static CityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CityInfo.PARSER, input, extensionRegistry);
        }
        
        public static CityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CityInfo.PARSER, input);
        }
        
        public static CityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CityInfo prototype) {
            return CityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CityInfo getDefaultInstance() {
            return CityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<CityInfo> parser() {
            return CityInfo.PARSER;
        }
        
        @Override
        public Parser<CityInfo> getParserForType() {
            return CityInfo.PARSER;
        }
        
        @Override
        public CityInfo getDefaultInstanceForType() {
            return CityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CityInfo();
            PARSER = new AbstractParser<CityInfo>() {
                @Override
                public CityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CityInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CityInfoOrBuilder
        {
            private int cityId_;
            private int crystalNum_;
            private int level_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CityInfoOuterClass.internal_static_CityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CityInfoOuterClass.internal_static_CityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CityInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cityId_ = 0;
                this.crystalNum_ = 0;
                this.level_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CityInfoOuterClass.internal_static_CityInfo_descriptor;
            }
            
            @Override
            public CityInfo getDefaultInstanceForType() {
                return CityInfo.getDefaultInstance();
            }
            
            @Override
            public CityInfo build() {
                final CityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CityInfo buildPartial() {
                final CityInfo result = new CityInfo(this);
                result.cityId_ = this.cityId_;
                result.crystalNum_ = this.crystalNum_;
                result.level_ = this.level_;
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
                if (other instanceof CityInfo) {
                    return this.mergeFrom((CityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CityInfo other) {
                if (other == CityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getCityId() != 0) {
                    this.setCityId(other.getCityId());
                }
                if (other.getCrystalNum() != 0) {
                    this.setCrystalNum(other.getCrystalNum());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
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
                CityInfo parsedMessage = null;
                try {
                    parsedMessage = CityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CityInfo)e.getUnfinishedMessage();
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
            public int getCityId() {
                return this.cityId_;
            }
            
            public Builder setCityId(final int value) {
                this.cityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCityId() {
                this.cityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCrystalNum() {
                return this.crystalNum_;
            }
            
            public Builder setCrystalNum(final int value) {
                this.crystalNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCrystalNum() {
                this.crystalNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
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
    
    public interface CityInfoOrBuilder extends MessageOrBuilder
    {
        int getCityId();
        
        int getCrystalNum();
        
        int getLevel();
    }
}
