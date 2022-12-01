// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk3000HKHFFDEMNKN
{
    private static final Descriptors.Descriptor internal_static_Unk3000_HKHFFDEMNKN_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk3000_HKHFFDEMNKN_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk3000HKHFFDEMNKN() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk3000HKHFFDEMNKN.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk3000_HKHFFDEMNKN.proto\u001a\u0014WidgetSlotData.proto\"F\n\u0013Unk3000_HKHFFDEMNKN\u0012\u000b\n\u0003uid\u0018\u000e \u0001(\r\u0012\"\n\tslot_list\u0018\r \u0003(\u000b2\u000f.WidgetSlotDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk3000HKHFFDEMNKN.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotDataOuterClass.getDescriptor() });
        internal_static_Unk3000_HKHFFDEMNKN_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk3000_HKHFFDEMNKN_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_descriptor, new String[] { "Uid", "SlotList" });
        WidgetSlotDataOuterClass.getDescriptor();
    }
    
    public static final class Unk3000_HKHFFDEMNKN extends GeneratedMessageV3 implements Unk3000_HKHFFDEMNKNOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 14;
        private int uid_;
        public static final int SLOT_LIST_FIELD_NUMBER = 13;
        private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
        private byte memoizedIsInitialized;
        private static final Unk3000_HKHFFDEMNKN DEFAULT_INSTANCE;
        private static final Parser<Unk3000_HKHFFDEMNKN> PARSER;
        
        private Unk3000_HKHFFDEMNKN(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk3000_HKHFFDEMNKN() {
            this.memoizedIsInitialized = -1;
            this.slotList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk3000_HKHFFDEMNKN();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk3000_HKHFFDEMNKN(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.slotList_.add(input.readMessage(WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
                            continue;
                        }
                        case 112: {
                            this.uid_ = input.readUInt32();
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
                    this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_HKHFFDEMNKN.class, Builder.class);
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
            return this.slotList_;
        }
        
        @Override
        public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
            return this.slotList_;
        }
        
        @Override
        public int getSlotListCount() {
            return this.slotList_.size();
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
            return this.slotList_.get(index);
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
            return this.slotList_.get(index);
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
            for (int i = 0; i < this.slotList_.size(); ++i) {
                output.writeMessage(13, this.slotList_.get(i));
            }
            if (this.uid_ != 0) {
                output.writeUInt32(14, this.uid_);
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
            for (int i = 0; i < this.slotList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.slotList_.get(i));
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.uid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk3000_HKHFFDEMNKN)) {
                return super.equals(obj);
            }
            final Unk3000_HKHFFDEMNKN other = (Unk3000_HKHFFDEMNKN)obj;
            return this.getUid() == other.getUid() && this.getSlotListList().equals(other.getSlotListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getUid();
            if (this.getSlotListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getSlotListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk3000_HKHFFDEMNKN.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_HKHFFDEMNKN parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input);
        }
        
        public static Unk3000_HKHFFDEMNKN parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input, extensionRegistry);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input);
        }
        
        public static Unk3000_HKHFFDEMNKN parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk3000_HKHFFDEMNKN.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk3000_HKHFFDEMNKN.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk3000_HKHFFDEMNKN prototype) {
            return Unk3000_HKHFFDEMNKN.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk3000_HKHFFDEMNKN.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk3000_HKHFFDEMNKN getDefaultInstance() {
            return Unk3000_HKHFFDEMNKN.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk3000_HKHFFDEMNKN> parser() {
            return Unk3000_HKHFFDEMNKN.PARSER;
        }
        
        @Override
        public Parser<Unk3000_HKHFFDEMNKN> getParserForType() {
            return Unk3000_HKHFFDEMNKN.PARSER;
        }
        
        @Override
        public Unk3000_HKHFFDEMNKN getDefaultInstanceForType() {
            return Unk3000_HKHFFDEMNKN.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk3000_HKHFFDEMNKN();
            PARSER = new AbstractParser<Unk3000_HKHFFDEMNKN>() {
                @Override
                public Unk3000_HKHFFDEMNKN parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk3000_HKHFFDEMNKN(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk3000_HKHFFDEMNKNOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk3000_HKHFFDEMNKN.class, Builder.class);
            }
            
            private Builder() {
                this.slotList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.slotList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk3000_HKHFFDEMNKN.alwaysUseFieldBuilders) {
                    this.getSlotListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.slotListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk3000HKHFFDEMNKN.internal_static_Unk3000_HKHFFDEMNKN_descriptor;
            }
            
            @Override
            public Unk3000_HKHFFDEMNKN getDefaultInstanceForType() {
                return Unk3000_HKHFFDEMNKN.getDefaultInstance();
            }
            
            @Override
            public Unk3000_HKHFFDEMNKN build() {
                final Unk3000_HKHFFDEMNKN result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk3000_HKHFFDEMNKN buildPartial() {
                final Unk3000_HKHFFDEMNKN result = new Unk3000_HKHFFDEMNKN(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                if (this.slotListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.slotList_ = this.slotList_;
                }
                else {
                    result.slotList_ = this.slotListBuilder_.build();
                }
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
                if (other instanceof Unk3000_HKHFFDEMNKN) {
                    return this.mergeFrom((Unk3000_HKHFFDEMNKN)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk3000_HKHFFDEMNKN other) {
                if (other == Unk3000_HKHFFDEMNKN.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (this.slotListBuilder_ == null) {
                    if (!other.slotList_.isEmpty()) {
                        if (this.slotList_.isEmpty()) {
                            this.slotList_ = other.slotList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSlotListIsMutable();
                            this.slotList_.addAll(other.slotList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.slotList_.isEmpty()) {
                    if (this.slotListBuilder_.isEmpty()) {
                        this.slotListBuilder_.dispose();
                        this.slotListBuilder_ = null;
                        this.slotList_ = other.slotList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.slotListBuilder_ = (Unk3000_HKHFFDEMNKN.alwaysUseFieldBuilders ? this.getSlotListFieldBuilder() : null);
                    }
                    else {
                        this.slotListBuilder_.addAllMessages(other.slotList_);
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
                Unk3000_HKHFFDEMNKN parsedMessage = null;
                try {
                    parsedMessage = Unk3000_HKHFFDEMNKN.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk3000_HKHFFDEMNKN)e.getUnfinishedMessage();
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
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureSlotListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>(this.slotList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
                if (this.slotListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                return this.slotListBuilder_.getMessageList();
            }
            
            @Override
            public int getSlotListCount() {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.size();
                }
                return this.slotListBuilder_.getCount();
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessage(index);
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSlotList(final Iterable<? extends WidgetSlotDataOuterClass.WidgetSlotData> values) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.slotList_);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSlotList() {
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
                if (this.slotListBuilder_ != null) {
                    return this.slotListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>)this.slotList_);
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
                return this.getSlotListFieldBuilder().addBuilder(WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().addBuilder(index, WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public List<WidgetSlotDataOuterClass.WidgetSlotData.Builder> getSlotListBuilderList() {
                return this.getSlotListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListFieldBuilder() {
                if (this.slotListBuilder_ == null) {
                    this.slotListBuilder_ = new RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(this.slotList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.slotList_ = null;
                }
                return this.slotListBuilder_;
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
    
    public interface Unk3000_HKHFFDEMNKNOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList();
        
        WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int p0);
        
        int getSlotListCount();
        
        List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList();
        
        WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int p0);
    }
}
