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

public final class StoreWeightLimitNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_StoreWeightLimitNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StoreWeightLimitNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private StoreWeightLimitNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StoreWeightLimitNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cStoreWeightLimitNotify.proto\u001a\u000fStoreType.proto\"\u00c6\u0001\n\u0016StoreWeightLimitNotify\u0012\u001a\n\u0012weapon_count_limit\u0018\r \u0001(\r\u0012\u001e\n\nstore_type\u0018\u0002 \u0001(\u000e2\n.StoreType\u0012\u001c\n\u0014material_count_limit\u0018\u0003 \u0001(\r\u0012\u001d\n\u0015reliquary_count_limit\u0018\u000f \u0001(\r\u0012\u001d\n\u0015furniture_count_limit\u0018\u0005 \u0001(\r\u0012\u0014\n\fweight_limit\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StoreWeightLimitNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { StoreTypeOuterClass.getDescriptor() });
        internal_static_StoreWeightLimitNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_StoreWeightLimitNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor, new String[] { "WeaponCountLimit", "StoreType", "MaterialCountLimit", "ReliquaryCountLimit", "FurnitureCountLimit", "WeightLimit" });
        StoreTypeOuterClass.getDescriptor();
    }
    
    public static final class StoreWeightLimitNotify extends GeneratedMessageV3 implements StoreWeightLimitNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WEAPON_COUNT_LIMIT_FIELD_NUMBER = 13;
        private int weaponCountLimit_;
        public static final int STORE_TYPE_FIELD_NUMBER = 2;
        private int storeType_;
        public static final int MATERIAL_COUNT_LIMIT_FIELD_NUMBER = 3;
        private int materialCountLimit_;
        public static final int RELIQUARY_COUNT_LIMIT_FIELD_NUMBER = 15;
        private int reliquaryCountLimit_;
        public static final int FURNITURE_COUNT_LIMIT_FIELD_NUMBER = 5;
        private int furnitureCountLimit_;
        public static final int WEIGHT_LIMIT_FIELD_NUMBER = 8;
        private int weightLimit_;
        private byte memoizedIsInitialized;
        private static final StoreWeightLimitNotify DEFAULT_INSTANCE;
        private static final Parser<StoreWeightLimitNotify> PARSER;
        
        private StoreWeightLimitNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private StoreWeightLimitNotify() {
            this.memoizedIsInitialized = -1;
            this.storeType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new StoreWeightLimitNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private StoreWeightLimitNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.storeType_ = rawValue;
                            continue;
                        }
                        case 24: {
                            this.materialCountLimit_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.furnitureCountLimit_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.weightLimit_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.weaponCountLimit_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.reliquaryCountLimit_ = input.readUInt32();
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
            return StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreWeightLimitNotify.class, Builder.class);
        }
        
        @Override
        public int getWeaponCountLimit() {
            return this.weaponCountLimit_;
        }
        
        @Override
        public int getStoreTypeValue() {
            return this.storeType_;
        }
        
        @Override
        public StoreTypeOuterClass.StoreType getStoreType() {
            final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
            return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getMaterialCountLimit() {
            return this.materialCountLimit_;
        }
        
        @Override
        public int getReliquaryCountLimit() {
            return this.reliquaryCountLimit_;
        }
        
        @Override
        public int getFurnitureCountLimit() {
            return this.furnitureCountLimit_;
        }
        
        @Override
        public int getWeightLimit() {
            return this.weightLimit_;
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
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                output.writeEnum(2, this.storeType_);
            }
            if (this.materialCountLimit_ != 0) {
                output.writeUInt32(3, this.materialCountLimit_);
            }
            if (this.furnitureCountLimit_ != 0) {
                output.writeUInt32(5, this.furnitureCountLimit_);
            }
            if (this.weightLimit_ != 0) {
                output.writeUInt32(8, this.weightLimit_);
            }
            if (this.weaponCountLimit_ != 0) {
                output.writeUInt32(13, this.weaponCountLimit_);
            }
            if (this.reliquaryCountLimit_ != 0) {
                output.writeUInt32(15, this.reliquaryCountLimit_);
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
            if (this.storeType_ != StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.storeType_);
            }
            if (this.materialCountLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.materialCountLimit_);
            }
            if (this.furnitureCountLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.furnitureCountLimit_);
            }
            if (this.weightLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.weightLimit_);
            }
            if (this.weaponCountLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.weaponCountLimit_);
            }
            if (this.reliquaryCountLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.reliquaryCountLimit_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreWeightLimitNotify)) {
                return super.equals(obj);
            }
            final StoreWeightLimitNotify other = (StoreWeightLimitNotify)obj;
            return this.getWeaponCountLimit() == other.getWeaponCountLimit() && this.storeType_ == other.storeType_ && this.getMaterialCountLimit() == other.getMaterialCountLimit() && this.getReliquaryCountLimit() == other.getReliquaryCountLimit() && this.getFurnitureCountLimit() == other.getFurnitureCountLimit() && this.getWeightLimit() == other.getWeightLimit() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getWeaponCountLimit();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.storeType_;
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMaterialCountLimit();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getReliquaryCountLimit();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getFurnitureCountLimit();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getWeightLimit();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static StoreWeightLimitNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data);
        }
        
        public static StoreWeightLimitNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreWeightLimitNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data);
        }
        
        public static StoreWeightLimitNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreWeightLimitNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data);
        }
        
        public static StoreWeightLimitNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StoreWeightLimitNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StoreWeightLimitNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreWeightLimitNotify.PARSER, input);
        }
        
        public static StoreWeightLimitNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreWeightLimitNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreWeightLimitNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreWeightLimitNotify.PARSER, input);
        }
        
        public static StoreWeightLimitNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StoreWeightLimitNotify.PARSER, input, extensionRegistry);
        }
        
        public static StoreWeightLimitNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreWeightLimitNotify.PARSER, input);
        }
        
        public static StoreWeightLimitNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StoreWeightLimitNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return StoreWeightLimitNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final StoreWeightLimitNotify prototype) {
            return StoreWeightLimitNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == StoreWeightLimitNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static StoreWeightLimitNotify getDefaultInstance() {
            return StoreWeightLimitNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<StoreWeightLimitNotify> parser() {
            return StoreWeightLimitNotify.PARSER;
        }
        
        @Override
        public Parser<StoreWeightLimitNotify> getParserForType() {
            return StoreWeightLimitNotify.PARSER;
        }
        
        @Override
        public StoreWeightLimitNotify getDefaultInstanceForType() {
            return StoreWeightLimitNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new StoreWeightLimitNotify();
            PARSER = new AbstractParser<StoreWeightLimitNotify>() {
                @Override
                public StoreWeightLimitNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new StoreWeightLimitNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoreWeightLimitNotifyOrBuilder
        {
            private int weaponCountLimit_;
            private int storeType_;
            private int materialCountLimit_;
            private int reliquaryCountLimit_;
            private int furnitureCountLimit_;
            private int weightLimit_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreWeightLimitNotify.class, Builder.class);
            }
            
            private Builder() {
                this.storeType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.storeType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (StoreWeightLimitNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.weaponCountLimit_ = 0;
                this.storeType_ = 0;
                this.materialCountLimit_ = 0;
                this.reliquaryCountLimit_ = 0;
                this.furnitureCountLimit_ = 0;
                this.weightLimit_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
            }
            
            @Override
            public StoreWeightLimitNotify getDefaultInstanceForType() {
                return StoreWeightLimitNotify.getDefaultInstance();
            }
            
            @Override
            public StoreWeightLimitNotify build() {
                final StoreWeightLimitNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public StoreWeightLimitNotify buildPartial() {
                final StoreWeightLimitNotify result = new StoreWeightLimitNotify(this);
                result.weaponCountLimit_ = this.weaponCountLimit_;
                result.storeType_ = this.storeType_;
                result.materialCountLimit_ = this.materialCountLimit_;
                result.reliquaryCountLimit_ = this.reliquaryCountLimit_;
                result.furnitureCountLimit_ = this.furnitureCountLimit_;
                result.weightLimit_ = this.weightLimit_;
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
                if (other instanceof StoreWeightLimitNotify) {
                    return this.mergeFrom((StoreWeightLimitNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final StoreWeightLimitNotify other) {
                if (other == StoreWeightLimitNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getWeaponCountLimit() != 0) {
                    this.setWeaponCountLimit(other.getWeaponCountLimit());
                }
                if (other.storeType_ != 0) {
                    this.setStoreTypeValue(other.getStoreTypeValue());
                }
                if (other.getMaterialCountLimit() != 0) {
                    this.setMaterialCountLimit(other.getMaterialCountLimit());
                }
                if (other.getReliquaryCountLimit() != 0) {
                    this.setReliquaryCountLimit(other.getReliquaryCountLimit());
                }
                if (other.getFurnitureCountLimit() != 0) {
                    this.setFurnitureCountLimit(other.getFurnitureCountLimit());
                }
                if (other.getWeightLimit() != 0) {
                    this.setWeightLimit(other.getWeightLimit());
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
                StoreWeightLimitNotify parsedMessage = null;
                try {
                    parsedMessage = StoreWeightLimitNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (StoreWeightLimitNotify)e.getUnfinishedMessage();
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
            public int getWeaponCountLimit() {
                return this.weaponCountLimit_;
            }
            
            public Builder setWeaponCountLimit(final int value) {
                this.weaponCountLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeaponCountLimit() {
                this.weaponCountLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStoreTypeValue() {
                return this.storeType_;
            }
            
            public Builder setStoreTypeValue(final int value) {
                this.storeType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public StoreTypeOuterClass.StoreType getStoreType() {
                final StoreTypeOuterClass.StoreType result = StoreTypeOuterClass.StoreType.valueOf(this.storeType_);
                return (result == null) ? StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
            }
            
            public Builder setStoreType(final StoreTypeOuterClass.StoreType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.storeType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearStoreType() {
                this.storeType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaterialCountLimit() {
                return this.materialCountLimit_;
            }
            
            public Builder setMaterialCountLimit(final int value) {
                this.materialCountLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaterialCountLimit() {
                this.materialCountLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getReliquaryCountLimit() {
                return this.reliquaryCountLimit_;
            }
            
            public Builder setReliquaryCountLimit(final int value) {
                this.reliquaryCountLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearReliquaryCountLimit() {
                this.reliquaryCountLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFurnitureCountLimit() {
                return this.furnitureCountLimit_;
            }
            
            public Builder setFurnitureCountLimit(final int value) {
                this.furnitureCountLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureCountLimit() {
                this.furnitureCountLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWeightLimit() {
                return this.weightLimit_;
            }
            
            public Builder setWeightLimit(final int value) {
                this.weightLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeightLimit() {
                this.weightLimit_ = 0;
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
    
    public interface StoreWeightLimitNotifyOrBuilder extends MessageOrBuilder
    {
        int getWeaponCountLimit();
        
        int getStoreTypeValue();
        
        StoreTypeOuterClass.StoreType getStoreType();
        
        int getMaterialCountLimit();
        
        int getReliquaryCountLimit();
        
        int getFurnitureCountLimit();
        
        int getWeightLimit();
    }
}
