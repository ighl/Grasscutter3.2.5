// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
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

public final class ItemOuterClass
{
    private static final Descriptors.Descriptor internal_static_Item_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Item_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ItemOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ItemOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\nItem.proto\u001a\u000bEquip.proto\u001a\u000fFurniture.proto\u001a\u000eMaterial.proto\"\u0088\u0001\n\u0004Item\u0012\u000f\n\u0007item_id\u0018\u0001 \u0001(\r\u0012\f\n\u0004guid\u0018\u0002 \u0001(\u0004\u0012\u001d\n\bmaterial\u0018\u0005 \u0001(\u000b2\t.MaterialH\u0000\u0012\u0017\n\u0005equip\u0018\u0006 \u0001(\u000b2\u0006.EquipH\u0000\u0012\u001f\n\tfurniture\u0018\u0007 \u0001(\u000b2\n.FurnitureH\u0000B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ItemOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { EquipOuterClass.getDescriptor(), FurnitureOuterClass.getDescriptor(), MaterialOuterClass.getDescriptor() });
        internal_static_Item_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Item_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ItemOuterClass.internal_static_Item_descriptor, new String[] { "ItemId", "Guid", "Material", "Equip", "Furniture", "Detail" });
        EquipOuterClass.getDescriptor();
        FurnitureOuterClass.getDescriptor();
        MaterialOuterClass.getDescriptor();
    }
    
    public static final class Item extends GeneratedMessageV3 implements ItemOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int ITEM_ID_FIELD_NUMBER = 1;
        private int itemId_;
        public static final int GUID_FIELD_NUMBER = 2;
        private long guid_;
        public static final int MATERIAL_FIELD_NUMBER = 5;
        public static final int EQUIP_FIELD_NUMBER = 6;
        public static final int FURNITURE_FIELD_NUMBER = 7;
        private byte memoizedIsInitialized;
        private static final Item DEFAULT_INSTANCE;
        private static final Parser<Item> PARSER;
        
        private Item(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private Item() {
            this.detailCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Item();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Item(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 42: {
                            MaterialOuterClass.Material.Builder subBuilder = null;
                            if (this.detailCase_ == 5) {
                                subBuilder = ((MaterialOuterClass.Material)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(MaterialOuterClass.Material.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((MaterialOuterClass.Material)this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.detailCase_ = 5;
                            continue;
                        }
                        case 50: {
                            EquipOuterClass.Equip.Builder subBuilder2 = null;
                            if (this.detailCase_ == 6) {
                                subBuilder2 = ((EquipOuterClass.Equip)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(EquipOuterClass.Equip.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((EquipOuterClass.Equip)this.detail_);
                                this.detail_ = subBuilder2.buildPartial();
                            }
                            this.detailCase_ = 6;
                            continue;
                        }
                        case 58: {
                            FurnitureOuterClass.Furniture.Builder subBuilder3 = null;
                            if (this.detailCase_ == 7) {
                                subBuilder3 = ((FurnitureOuterClass.Furniture)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(FurnitureOuterClass.Furniture.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((FurnitureOuterClass.Furniture)this.detail_);
                                this.detail_ = subBuilder3.buildPartial();
                            }
                            this.detailCase_ = 7;
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
            return ItemOuterClass.internal_static_Item_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        @Override
        public boolean hasMaterial() {
            return this.detailCase_ == 5;
        }
        
        @Override
        public MaterialOuterClass.Material getMaterial() {
            if (this.detailCase_ == 5) {
                return (MaterialOuterClass.Material)this.detail_;
            }
            return MaterialOuterClass.Material.getDefaultInstance();
        }
        
        @Override
        public MaterialOuterClass.MaterialOrBuilder getMaterialOrBuilder() {
            if (this.detailCase_ == 5) {
                return (MaterialOuterClass.Material)this.detail_;
            }
            return MaterialOuterClass.Material.getDefaultInstance();
        }
        
        @Override
        public boolean hasEquip() {
            return this.detailCase_ == 6;
        }
        
        @Override
        public EquipOuterClass.Equip getEquip() {
            if (this.detailCase_ == 6) {
                return (EquipOuterClass.Equip)this.detail_;
            }
            return EquipOuterClass.Equip.getDefaultInstance();
        }
        
        @Override
        public EquipOuterClass.EquipOrBuilder getEquipOrBuilder() {
            if (this.detailCase_ == 6) {
                return (EquipOuterClass.Equip)this.detail_;
            }
            return EquipOuterClass.Equip.getDefaultInstance();
        }
        
        @Override
        public boolean hasFurniture() {
            return this.detailCase_ == 7;
        }
        
        @Override
        public FurnitureOuterClass.Furniture getFurniture() {
            if (this.detailCase_ == 7) {
                return (FurnitureOuterClass.Furniture)this.detail_;
            }
            return FurnitureOuterClass.Furniture.getDefaultInstance();
        }
        
        @Override
        public FurnitureOuterClass.FurnitureOrBuilder getFurnitureOrBuilder() {
            if (this.detailCase_ == 7) {
                return (FurnitureOuterClass.Furniture)this.detail_;
            }
            return FurnitureOuterClass.Furniture.getDefaultInstance();
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
            if (this.itemId_ != 0) {
                output.writeUInt32(1, this.itemId_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(2, this.guid_);
            }
            if (this.detailCase_ == 5) {
                output.writeMessage(5, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 6) {
                output.writeMessage(6, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 7) {
                output.writeMessage(7, (MessageLite)this.detail_);
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
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.itemId_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.guid_);
            }
            if (this.detailCase_ == 5) {
                size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 6) {
                size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 7) {
                size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.detail_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return super.equals(obj);
            }
            final Item other = (Item)obj;
            if (this.getItemId() != other.getItemId()) {
                return false;
            }
            if (this.getGuid() != other.getGuid()) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 5: {
                    if (!this.getMaterial().equals(other.getMaterial())) {
                        return false;
                    }
                    break;
                }
                case 6: {
                    if (!this.getEquip().equals(other.getEquip())) {
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (!this.getFurniture().equals(other.getFurniture())) {
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
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            switch (this.detailCase_) {
                case 5: {
                    hash = 37 * hash + 5;
                    hash = 53 * hash + this.getMaterial().hashCode();
                    break;
                }
                case 6: {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getEquip().hashCode();
                    break;
                }
                case 7: {
                    hash = 37 * hash + 7;
                    hash = 53 * hash + this.getFurniture().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Item parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data);
        }
        
        public static Item parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Item parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data);
        }
        
        public static Item parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Item parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data);
        }
        
        public static Item parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Item.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Item parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Item.PARSER, input);
        }
        
        public static Item parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Item.PARSER, input, extensionRegistry);
        }
        
        public static Item parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Item.PARSER, input);
        }
        
        public static Item parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Item.PARSER, input, extensionRegistry);
        }
        
        public static Item parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Item.PARSER, input);
        }
        
        public static Item parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Item.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Item.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Item prototype) {
            return Item.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Item.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Item getDefaultInstance() {
            return Item.DEFAULT_INSTANCE;
        }
        
        public static Parser<Item> parser() {
            return Item.PARSER;
        }
        
        @Override
        public Parser<Item> getParserForType() {
            return Item.PARSER;
        }
        
        @Override
        public Item getDefaultInstanceForType() {
            return Item.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Item();
            PARSER = new AbstractParser<Item>() {
                @Override
                public Item parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Item(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MATERIAL(5), 
            EQUIP(6), 
            FURNITURE(7), 
            DETAIL_NOT_SET(0);
            
            private final int value;
            
            private DetailCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DetailCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DetailCase forNumber(final int value) {
                switch (value) {
                    case 5: {
                        return DetailCase.MATERIAL;
                    }
                    case 6: {
                        return DetailCase.EQUIP;
                    }
                    case 7: {
                        return DetailCase.FURNITURE;
                    }
                    case 0: {
                        return DetailCase.DETAIL_NOT_SET;
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
            
            private static /* synthetic */ DetailCase[] value() {
                return new DetailCase[] { DetailCase.MATERIAL, DetailCase.EQUIP, DetailCase.FURNITURE, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private int itemId_;
            private long guid_;
            private SingleFieldBuilderV3<MaterialOuterClass.Material, MaterialOuterClass.Material.Builder, MaterialOuterClass.MaterialOrBuilder> materialBuilder_;
            private SingleFieldBuilderV3<EquipOuterClass.Equip, EquipOuterClass.Equip.Builder, EquipOuterClass.EquipOrBuilder> equipBuilder_;
            private SingleFieldBuilderV3<FurnitureOuterClass.Furniture, FurnitureOuterClass.Furniture.Builder, FurnitureOuterClass.FurnitureOrBuilder> furnitureBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_Item_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Item.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemId_ = 0;
                this.guid_ = 0L;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_Item_descriptor;
            }
            
            @Override
            public Item getDefaultInstanceForType() {
                return Item.getDefaultInstance();
            }
            
            @Override
            public Item build() {
                final Item result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Item buildPartial() {
                final Item result = new Item(this);
                result.itemId_ = this.itemId_;
                result.guid_ = this.guid_;
                if (this.detailCase_ == 5) {
                    if (this.materialBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.materialBuilder_.build();
                    }
                }
                if (this.detailCase_ == 6) {
                    if (this.equipBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.equipBuilder_.build();
                    }
                }
                if (this.detailCase_ == 7) {
                    if (this.furnitureBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.furnitureBuilder_.build();
                    }
                }
                result.detailCase_ = this.detailCase_;
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
                if (other instanceof Item) {
                    return this.mergeFrom((Item)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Item other) {
                if (other == Item.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                switch (other.getDetailCase()) {
                    case MATERIAL: {
                        this.mergeMaterial(other.getMaterial());
                        break;
                    }
                    case EQUIP: {
                        this.mergeEquip(other.getEquip());
                        break;
                    }
                    case FURNITURE: {
                        this.mergeFurniture(other.getFurniture());
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
                Item parsedMessage = null;
                try {
                    parsedMessage = Item.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Item)e.getUnfinishedMessage();
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
            public DetailCase getDetailCase() {
                return DetailCase.forNumber(this.detailCase_);
            }
            
            public Builder clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
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
            public boolean hasMaterial() {
                return this.detailCase_ == 5;
            }
            
            @Override
            public MaterialOuterClass.Material getMaterial() {
                if (this.materialBuilder_ == null) {
                    if (this.detailCase_ == 5) {
                        return (MaterialOuterClass.Material)this.detail_;
                    }
                    return MaterialOuterClass.Material.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 5) {
                        return this.materialBuilder_.getMessage();
                    }
                    return MaterialOuterClass.Material.getDefaultInstance();
                }
            }
            
            public Builder setMaterial(final MaterialOuterClass.Material value) {
                if (this.materialBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.materialBuilder_.setMessage(value);
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder setMaterial(final MaterialOuterClass.Material.Builder builderForValue) {
                if (this.materialBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.materialBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder mergeMaterial(final MaterialOuterClass.Material value) {
                if (this.materialBuilder_ == null) {
                    if (this.detailCase_ == 5 && this.detail_ != MaterialOuterClass.Material.getDefaultInstance()) {
                        this.detail_ = MaterialOuterClass.Material.newBuilder((MaterialOuterClass.Material)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 5) {
                        this.materialBuilder_.mergeFrom(value);
                    }
                    this.materialBuilder_.setMessage(value);
                }
                this.detailCase_ = 5;
                return this;
            }
            
            public Builder clearMaterial() {
                if (this.materialBuilder_ == null) {
                    if (this.detailCase_ == 5) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 5) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.materialBuilder_.clear();
                }
                return this;
            }
            
            public MaterialOuterClass.Material.Builder getMaterialBuilder() {
                return this.getMaterialFieldBuilder().getBuilder();
            }
            
            @Override
            public MaterialOuterClass.MaterialOrBuilder getMaterialOrBuilder() {
                if (this.detailCase_ == 5 && this.materialBuilder_ != null) {
                    return this.materialBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 5) {
                    return (MaterialOuterClass.Material)this.detail_;
                }
                return MaterialOuterClass.Material.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MaterialOuterClass.Material, MaterialOuterClass.Material.Builder, MaterialOuterClass.MaterialOrBuilder> getMaterialFieldBuilder() {
                if (this.materialBuilder_ == null) {
                    if (this.detailCase_ != 5) {
                        this.detail_ = MaterialOuterClass.Material.getDefaultInstance();
                    }
                    this.materialBuilder_ = new SingleFieldBuilderV3<MaterialOuterClass.Material, MaterialOuterClass.Material.Builder, MaterialOuterClass.MaterialOrBuilder>((MaterialOuterClass.Material)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 5;
                this.onChanged();
                return this.materialBuilder_;
            }
            
            @Override
            public boolean hasEquip() {
                return this.detailCase_ == 6;
            }
            
            @Override
            public EquipOuterClass.Equip getEquip() {
                if (this.equipBuilder_ == null) {
                    if (this.detailCase_ == 6) {
                        return (EquipOuterClass.Equip)this.detail_;
                    }
                    return EquipOuterClass.Equip.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 6) {
                        return this.equipBuilder_.getMessage();
                    }
                    return EquipOuterClass.Equip.getDefaultInstance();
                }
            }
            
            public Builder setEquip(final EquipOuterClass.Equip value) {
                if (this.equipBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.equipBuilder_.setMessage(value);
                }
                this.detailCase_ = 6;
                return this;
            }
            
            public Builder setEquip(final EquipOuterClass.Equip.Builder builderForValue) {
                if (this.equipBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.equipBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 6;
                return this;
            }
            
            public Builder mergeEquip(final EquipOuterClass.Equip value) {
                if (this.equipBuilder_ == null) {
                    if (this.detailCase_ == 6 && this.detail_ != EquipOuterClass.Equip.getDefaultInstance()) {
                        this.detail_ = EquipOuterClass.Equip.newBuilder((EquipOuterClass.Equip)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 6) {
                        this.equipBuilder_.mergeFrom(value);
                    }
                    this.equipBuilder_.setMessage(value);
                }
                this.detailCase_ = 6;
                return this;
            }
            
            public Builder clearEquip() {
                if (this.equipBuilder_ == null) {
                    if (this.detailCase_ == 6) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 6) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.equipBuilder_.clear();
                }
                return this;
            }
            
            public EquipOuterClass.Equip.Builder getEquipBuilder() {
                return this.getEquipFieldBuilder().getBuilder();
            }
            
            @Override
            public EquipOuterClass.EquipOrBuilder getEquipOrBuilder() {
                if (this.detailCase_ == 6 && this.equipBuilder_ != null) {
                    return this.equipBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 6) {
                    return (EquipOuterClass.Equip)this.detail_;
                }
                return EquipOuterClass.Equip.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<EquipOuterClass.Equip, EquipOuterClass.Equip.Builder, EquipOuterClass.EquipOrBuilder> getEquipFieldBuilder() {
                if (this.equipBuilder_ == null) {
                    if (this.detailCase_ != 6) {
                        this.detail_ = EquipOuterClass.Equip.getDefaultInstance();
                    }
                    this.equipBuilder_ = new SingleFieldBuilderV3<EquipOuterClass.Equip, EquipOuterClass.Equip.Builder, EquipOuterClass.EquipOrBuilder>((EquipOuterClass.Equip)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 6;
                this.onChanged();
                return this.equipBuilder_;
            }
            
            @Override
            public boolean hasFurniture() {
                return this.detailCase_ == 7;
            }
            
            @Override
            public FurnitureOuterClass.Furniture getFurniture() {
                if (this.furnitureBuilder_ == null) {
                    if (this.detailCase_ == 7) {
                        return (FurnitureOuterClass.Furniture)this.detail_;
                    }
                    return FurnitureOuterClass.Furniture.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 7) {
                        return this.furnitureBuilder_.getMessage();
                    }
                    return FurnitureOuterClass.Furniture.getDefaultInstance();
                }
            }
            
            public Builder setFurniture(final FurnitureOuterClass.Furniture value) {
                if (this.furnitureBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.furnitureBuilder_.setMessage(value);
                }
                this.detailCase_ = 7;
                return this;
            }
            
            public Builder setFurniture(final FurnitureOuterClass.Furniture.Builder builderForValue) {
                if (this.furnitureBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.furnitureBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 7;
                return this;
            }
            
            public Builder mergeFurniture(final FurnitureOuterClass.Furniture value) {
                if (this.furnitureBuilder_ == null) {
                    if (this.detailCase_ == 7 && this.detail_ != FurnitureOuterClass.Furniture.getDefaultInstance()) {
                        this.detail_ = FurnitureOuterClass.Furniture.newBuilder((FurnitureOuterClass.Furniture)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 7) {
                        this.furnitureBuilder_.mergeFrom(value);
                    }
                    this.furnitureBuilder_.setMessage(value);
                }
                this.detailCase_ = 7;
                return this;
            }
            
            public Builder clearFurniture() {
                if (this.furnitureBuilder_ == null) {
                    if (this.detailCase_ == 7) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 7) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.furnitureBuilder_.clear();
                }
                return this;
            }
            
            public FurnitureOuterClass.Furniture.Builder getFurnitureBuilder() {
                return this.getFurnitureFieldBuilder().getBuilder();
            }
            
            @Override
            public FurnitureOuterClass.FurnitureOrBuilder getFurnitureOrBuilder() {
                if (this.detailCase_ == 7 && this.furnitureBuilder_ != null) {
                    return this.furnitureBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 7) {
                    return (FurnitureOuterClass.Furniture)this.detail_;
                }
                return FurnitureOuterClass.Furniture.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<FurnitureOuterClass.Furniture, FurnitureOuterClass.Furniture.Builder, FurnitureOuterClass.FurnitureOrBuilder> getFurnitureFieldBuilder() {
                if (this.furnitureBuilder_ == null) {
                    if (this.detailCase_ != 7) {
                        this.detail_ = FurnitureOuterClass.Furniture.getDefaultInstance();
                    }
                    this.furnitureBuilder_ = new SingleFieldBuilderV3<FurnitureOuterClass.Furniture, FurnitureOuterClass.Furniture.Builder, FurnitureOuterClass.FurnitureOrBuilder>((FurnitureOuterClass.Furniture)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 7;
                this.onChanged();
                return this.furnitureBuilder_;
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
    
    public interface ItemOrBuilder extends MessageOrBuilder
    {
        int getItemId();
        
        long getGuid();
        
        boolean hasMaterial();
        
        MaterialOuterClass.Material getMaterial();
        
        MaterialOuterClass.MaterialOrBuilder getMaterialOrBuilder();
        
        boolean hasEquip();
        
        EquipOuterClass.Equip getEquip();
        
        EquipOuterClass.EquipOrBuilder getEquipOrBuilder();
        
        boolean hasFurniture();
        
        FurnitureOuterClass.Furniture getFurniture();
        
        FurnitureOuterClass.FurnitureOrBuilder getFurnitureOrBuilder();
        
        Item.DetailCase getDetailCase();
    }
}
