// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Internal;
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

public final class HomeMarkPointFurnitureDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeMarkPointFurnitureData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeMarkPointFurnitureData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeMarkPointFurnitureDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeMarkPointFurnitureDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n HomeMarkPointFurnitureData.proto\u001a\u001aHomeMarkPointNPCData.proto\u001a\u001cHomeMarkPointSuiteData.proto\u001a\fVector.proto\"\u00d1\u0001\n\u001aHomeMarkPointFurnitureData\u0012\f\n\u0004guid\u0018\u0001 \u0001(\r\u0012\u0014\n\ffurniture_id\u0018\u0002 \u0001(\r\u0012\u0016\n\u000efurniture_type\u0018\u0003 \u0001(\r\u0012\u0014\n\u0003pos\u0018\u0004 \u0001(\u000b2\u0007.Vector\u0012)\n\bnpc_data\u0018\u0006 \u0001(\u000b2\u0015.HomeMarkPointNPCDataH\u0000\u0012-\n\nsuite_data\u0018\u0007 \u0001(\u000b2\u0017.HomeMarkPointSuiteDataH\u0000B\u0007\n\u0005extraB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeMarkPointFurnitureDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeMarkPointNPCDataOuterClass.getDescriptor(), HomeMarkPointSuiteDataOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_HomeMarkPointFurnitureData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeMarkPointFurnitureData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_descriptor, new String[] { "Guid", "FurnitureId", "FurnitureType", "Pos", "NpcData", "SuiteData", "Extra" });
        HomeMarkPointNPCDataOuterClass.getDescriptor();
        HomeMarkPointSuiteDataOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class HomeMarkPointFurnitureData extends GeneratedMessageV3 implements HomeMarkPointFurnitureDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int extraCase_;
        private Object extra_;
        public static final int GUID_FIELD_NUMBER = 1;
        private int guid_;
        public static final int FURNITURE_ID_FIELD_NUMBER = 2;
        private int furnitureId_;
        public static final int FURNITURE_TYPE_FIELD_NUMBER = 3;
        private int furnitureType_;
        public static final int POS_FIELD_NUMBER = 4;
        private VectorOuterClass.Vector pos_;
        public static final int NPC_DATA_FIELD_NUMBER = 6;
        public static final int SUITE_DATA_FIELD_NUMBER = 7;
        private byte memoizedIsInitialized;
        private static final HomeMarkPointFurnitureData DEFAULT_INSTANCE;
        private static final Parser<HomeMarkPointFurnitureData> PARSER;
        
        private HomeMarkPointFurnitureData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.extraCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private HomeMarkPointFurnitureData() {
            this.extraCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeMarkPointFurnitureData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeMarkPointFurnitureData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.guid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.furnitureId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.furnitureType_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 50: {
                            HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder subBuilder2 = null;
                            if (this.extraCase_ == 6) {
                                subBuilder2 = ((HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_).toBuilder();
                            }
                            this.extra_ = input.readMessage(HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_);
                                this.extra_ = subBuilder2.buildPartial();
                            }
                            this.extraCase_ = 6;
                            continue;
                        }
                        case 58: {
                            HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder subBuilder3 = null;
                            if (this.extraCase_ == 7) {
                                subBuilder3 = ((HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_).toBuilder();
                            }
                            this.extra_ = input.readMessage(HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_);
                                this.extra_ = subBuilder3.buildPartial();
                            }
                            this.extraCase_ = 7;
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
            return HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointFurnitureData.class, Builder.class);
        }
        
        @Override
        public ExtraCase getExtraCase() {
            return ExtraCase.forNumber(this.extraCase_);
        }
        
        @Override
        public int getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getFurnitureId() {
            return this.furnitureId_;
        }
        
        @Override
        public int getFurnitureType() {
            return this.furnitureType_;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public boolean hasNpcData() {
            return this.extraCase_ == 6;
        }
        
        @Override
        public HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getNpcData() {
            if (this.extraCase_ == 6) {
                return (HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_;
            }
            return HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
        }
        
        @Override
        public HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder getNpcDataOrBuilder() {
            if (this.extraCase_ == 6) {
                return (HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_;
            }
            return HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
        }
        
        @Override
        public boolean hasSuiteData() {
            return this.extraCase_ == 7;
        }
        
        @Override
        public HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData getSuiteData() {
            if (this.extraCase_ == 7) {
                return (HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_;
            }
            return HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
        }
        
        @Override
        public HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder getSuiteDataOrBuilder() {
            if (this.extraCase_ == 7) {
                return (HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_;
            }
            return HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
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
            if (this.guid_ != 0) {
                output.writeUInt32(1, this.guid_);
            }
            if (this.furnitureId_ != 0) {
                output.writeUInt32(2, this.furnitureId_);
            }
            if (this.furnitureType_ != 0) {
                output.writeUInt32(3, this.furnitureType_);
            }
            if (this.pos_ != null) {
                output.writeMessage(4, this.getPos());
            }
            if (this.extraCase_ == 6) {
                output.writeMessage(6, (MessageLite)this.extra_);
            }
            if (this.extraCase_ == 7) {
                output.writeMessage(7, (MessageLite)this.extra_);
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
            if (this.guid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.guid_);
            }
            if (this.furnitureId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.furnitureId_);
            }
            if (this.furnitureType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.furnitureType_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getPos());
            }
            if (this.extraCase_ == 6) {
                size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.extra_);
            }
            if (this.extraCase_ == 7) {
                size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.extra_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeMarkPointFurnitureData)) {
                return super.equals(obj);
            }
            final HomeMarkPointFurnitureData other = (HomeMarkPointFurnitureData)obj;
            if (this.getGuid() != other.getGuid()) {
                return false;
            }
            if (this.getFurnitureId() != other.getFurnitureId()) {
                return false;
            }
            if (this.getFurnitureType() != other.getFurnitureType()) {
                return false;
            }
            if (this.hasPos() != other.hasPos()) {
                return false;
            }
            if (this.hasPos() && !this.getPos().equals(other.getPos())) {
                return false;
            }
            if (!this.getExtraCase().equals(other.getExtraCase())) {
                return false;
            }
            switch (this.extraCase_) {
                case 6: {
                    if (!this.getNpcData().equals(other.getNpcData())) {
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (!this.getSuiteData().equals(other.getSuiteData())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getGuid();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFurnitureId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getFurnitureType();
            if (this.hasPos()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getPos().hashCode();
            }
            switch (this.extraCase_) {
                case 6: {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getNpcData().hashCode();
                    break;
                }
                case 7: {
                    hash = 37 * hash + 7;
                    hash = 53 * hash + this.getSuiteData().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeMarkPointFurnitureData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointFurnitureData.PARSER, input);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointFurnitureData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointFurnitureData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointFurnitureData.PARSER, input);
        }
        
        public static HomeMarkPointFurnitureData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeMarkPointFurnitureData.PARSER, input, extensionRegistry);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointFurnitureData.PARSER, input);
        }
        
        public static HomeMarkPointFurnitureData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeMarkPointFurnitureData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeMarkPointFurnitureData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeMarkPointFurnitureData prototype) {
            return HomeMarkPointFurnitureData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeMarkPointFurnitureData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeMarkPointFurnitureData getDefaultInstance() {
            return HomeMarkPointFurnitureData.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeMarkPointFurnitureData> parser() {
            return HomeMarkPointFurnitureData.PARSER;
        }
        
        @Override
        public Parser<HomeMarkPointFurnitureData> getParserForType() {
            return HomeMarkPointFurnitureData.PARSER;
        }
        
        @Override
        public HomeMarkPointFurnitureData getDefaultInstanceForType() {
            return HomeMarkPointFurnitureData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeMarkPointFurnitureData();
            PARSER = new AbstractParser<HomeMarkPointFurnitureData>() {
                @Override
                public HomeMarkPointFurnitureData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeMarkPointFurnitureData(input, extensionRegistry);
                }
            };
        }
        
        public enum ExtraCase implements Internal.EnumLite, InternalOneOfEnum
        {
            NPC_DATA(6), 
            SUITE_DATA(7), 
            EXTRA_NOT_SET(0);
            
            private final int value;
            
            private ExtraCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ExtraCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ExtraCase forNumber(final int value) {
                switch (value) {
                    case 6: {
                        return ExtraCase.NPC_DATA;
                    }
                    case 7: {
                        return ExtraCase.SUITE_DATA;
                    }
                    case 0: {
                        return ExtraCase.EXTRA_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ExtraCase[] value() {
                return new ExtraCase[] { ExtraCase.NPC_DATA, ExtraCase.SUITE_DATA, ExtraCase.EXTRA_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeMarkPointFurnitureDataOrBuilder
        {
            private int extraCase_;
            private Object extra_;
            private int guid_;
            private int furnitureId_;
            private int furnitureType_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private SingleFieldBuilderV3<HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder> npcDataBuilder_;
            private SingleFieldBuilderV3<HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder> suiteDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeMarkPointFurnitureData.class, Builder.class);
            }
            
            private Builder() {
                this.extraCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.extraCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeMarkPointFurnitureData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.guid_ = 0;
                this.furnitureId_ = 0;
                this.furnitureType_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.extraCase_ = 0;
                this.extra_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeMarkPointFurnitureDataOuterClass.internal_static_HomeMarkPointFurnitureData_descriptor;
            }
            
            @Override
            public HomeMarkPointFurnitureData getDefaultInstanceForType() {
                return HomeMarkPointFurnitureData.getDefaultInstance();
            }
            
            @Override
            public HomeMarkPointFurnitureData build() {
                final HomeMarkPointFurnitureData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeMarkPointFurnitureData buildPartial() {
                final HomeMarkPointFurnitureData result = new HomeMarkPointFurnitureData(this);
                result.guid_ = this.guid_;
                result.furnitureId_ = this.furnitureId_;
                result.furnitureType_ = this.furnitureType_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                if (this.extraCase_ == 6) {
                    if (this.npcDataBuilder_ == null) {
                        result.extra_ = this.extra_;
                    }
                    else {
                        result.extra_ = this.npcDataBuilder_.build();
                    }
                }
                if (this.extraCase_ == 7) {
                    if (this.suiteDataBuilder_ == null) {
                        result.extra_ = this.extra_;
                    }
                    else {
                        result.extra_ = this.suiteDataBuilder_.build();
                    }
                }
                result.extraCase_ = this.extraCase_;
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
                if (other instanceof HomeMarkPointFurnitureData) {
                    return this.mergeFrom((HomeMarkPointFurnitureData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeMarkPointFurnitureData other) {
                if (other == HomeMarkPointFurnitureData.getDefaultInstance()) {
                    return this;
                }
                if (other.getGuid() != 0) {
                    this.setGuid(other.getGuid());
                }
                if (other.getFurnitureId() != 0) {
                    this.setFurnitureId(other.getFurnitureId());
                }
                if (other.getFurnitureType() != 0) {
                    this.setFurnitureType(other.getFurnitureType());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                switch (other.getExtraCase()) {
                    case NPC_DATA: {
                        this.mergeNpcData(other.getNpcData());
                        break;
                    }
                    case SUITE_DATA: {
                        this.mergeSuiteData(other.getSuiteData());
                        break;
                    }
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
                HomeMarkPointFurnitureData parsedMessage = null;
                try {
                    parsedMessage = HomeMarkPointFurnitureData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeMarkPointFurnitureData)e.getUnfinishedMessage();
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
            public ExtraCase getExtraCase() {
                return ExtraCase.forNumber(this.extraCase_);
            }
            
            public Builder clearExtra() {
                this.extraCase_ = 0;
                this.extra_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final int value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFurnitureId() {
                return this.furnitureId_;
            }
            
            public Builder setFurnitureId(final int value) {
                this.furnitureId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureId() {
                this.furnitureId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFurnitureType() {
                return this.furnitureType_;
            }
            
            public Builder setFurnitureType(final int value) {
                this.furnitureType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureType() {
                this.furnitureType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public boolean hasNpcData() {
                return this.extraCase_ == 6;
            }
            
            @Override
            public HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getNpcData() {
                if (this.npcDataBuilder_ == null) {
                    if (this.extraCase_ == 6) {
                        return (HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_;
                    }
                    return HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
                }
                else {
                    if (this.extraCase_ == 6) {
                        return this.npcDataBuilder_.getMessage();
                    }
                    return HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
                }
            }
            
            public Builder setNpcData(final HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData value) {
                if (this.npcDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.extra_ = value;
                    this.onChanged();
                }
                else {
                    this.npcDataBuilder_.setMessage(value);
                }
                this.extraCase_ = 6;
                return this;
            }
            
            public Builder setNpcData(final HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder builderForValue) {
                if (this.npcDataBuilder_ == null) {
                    this.extra_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.npcDataBuilder_.setMessage(builderForValue.build());
                }
                this.extraCase_ = 6;
                return this;
            }
            
            public Builder mergeNpcData(final HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData value) {
                if (this.npcDataBuilder_ == null) {
                    if (this.extraCase_ == 6 && this.extra_ != HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance()) {
                        this.extra_ = HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.newBuilder((HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.extra_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.extraCase_ == 6) {
                        this.npcDataBuilder_.mergeFrom(value);
                    }
                    this.npcDataBuilder_.setMessage(value);
                }
                this.extraCase_ = 6;
                return this;
            }
            
            public Builder clearNpcData() {
                if (this.npcDataBuilder_ == null) {
                    if (this.extraCase_ == 6) {
                        this.extraCase_ = 0;
                        this.extra_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.extraCase_ == 6) {
                        this.extraCase_ = 0;
                        this.extra_ = null;
                    }
                    this.npcDataBuilder_.clear();
                }
                return this;
            }
            
            public HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder getNpcDataBuilder() {
                return this.getNpcDataFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder getNpcDataOrBuilder() {
                if (this.extraCase_ == 6 && this.npcDataBuilder_ != null) {
                    return this.npcDataBuilder_.getMessageOrBuilder();
                }
                if (this.extraCase_ == 6) {
                    return (HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_;
                }
                return HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder> getNpcDataFieldBuilder() {
                if (this.npcDataBuilder_ == null) {
                    if (this.extraCase_ != 6) {
                        this.extra_ = HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
                    }
                    this.npcDataBuilder_ = new SingleFieldBuilderV3<HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder, HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder>((HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)this.extra_, this.getParentForChildren(), this.isClean());
                    this.extra_ = null;
                }
                this.extraCase_ = 6;
                this.onChanged();
                return this.npcDataBuilder_;
            }
            
            @Override
            public boolean hasSuiteData() {
                return this.extraCase_ == 7;
            }
            
            @Override
            public HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData getSuiteData() {
                if (this.suiteDataBuilder_ == null) {
                    if (this.extraCase_ == 7) {
                        return (HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_;
                    }
                    return HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
                }
                else {
                    if (this.extraCase_ == 7) {
                        return this.suiteDataBuilder_.getMessage();
                    }
                    return HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
                }
            }
            
            public Builder setSuiteData(final HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData value) {
                if (this.suiteDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.extra_ = value;
                    this.onChanged();
                }
                else {
                    this.suiteDataBuilder_.setMessage(value);
                }
                this.extraCase_ = 7;
                return this;
            }
            
            public Builder setSuiteData(final HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder builderForValue) {
                if (this.suiteDataBuilder_ == null) {
                    this.extra_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.suiteDataBuilder_.setMessage(builderForValue.build());
                }
                this.extraCase_ = 7;
                return this;
            }
            
            public Builder mergeSuiteData(final HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData value) {
                if (this.suiteDataBuilder_ == null) {
                    if (this.extraCase_ == 7 && this.extra_ != HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance()) {
                        this.extra_ = HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.newBuilder((HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.extra_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.extraCase_ == 7) {
                        this.suiteDataBuilder_.mergeFrom(value);
                    }
                    this.suiteDataBuilder_.setMessage(value);
                }
                this.extraCase_ = 7;
                return this;
            }
            
            public Builder clearSuiteData() {
                if (this.suiteDataBuilder_ == null) {
                    if (this.extraCase_ == 7) {
                        this.extraCase_ = 0;
                        this.extra_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.extraCase_ == 7) {
                        this.extraCase_ = 0;
                        this.extra_ = null;
                    }
                    this.suiteDataBuilder_.clear();
                }
                return this;
            }
            
            public HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder getSuiteDataBuilder() {
                return this.getSuiteDataFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder getSuiteDataOrBuilder() {
                if (this.extraCase_ == 7 && this.suiteDataBuilder_ != null) {
                    return this.suiteDataBuilder_.getMessageOrBuilder();
                }
                if (this.extraCase_ == 7) {
                    return (HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_;
                }
                return HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder> getSuiteDataFieldBuilder() {
                if (this.suiteDataBuilder_ == null) {
                    if (this.extraCase_ != 7) {
                        this.extra_ = HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.getDefaultInstance();
                    }
                    this.suiteDataBuilder_ = new SingleFieldBuilderV3<HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData.Builder, HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder>((HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData)this.extra_, this.getParentForChildren(), this.isClean());
                    this.extra_ = null;
                }
                this.extraCase_ = 7;
                this.onChanged();
                return this.suiteDataBuilder_;
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
    
    public interface HomeMarkPointFurnitureDataOrBuilder extends MessageOrBuilder
    {
        int getGuid();
        
        int getFurnitureId();
        
        int getFurnitureType();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        boolean hasNpcData();
        
        HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getNpcData();
        
        HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder getNpcDataOrBuilder();
        
        boolean hasSuiteData();
        
        HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteData getSuiteData();
        
        HomeMarkPointSuiteDataOuterClass.HomeMarkPointSuiteDataOrBuilder getSuiteDataOrBuilder();
        
        HomeMarkPointFurnitureData.ExtraCase getExtraCase();
    }
}
