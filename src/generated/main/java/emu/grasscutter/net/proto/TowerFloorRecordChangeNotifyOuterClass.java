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
import com.google.protobuf.Internal;
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

public final class TowerFloorRecordChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerFloorRecordChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerFloorRecordChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerFloorRecordChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"TowerFloorRecordChangeNotify.proto\u001a\u0016TowerFloorRecord.proto\"v\n\u001cTowerFloorRecordChangeNotify\u0012\"\n\u001ais_finished_entrance_floor\u0018\u000b \u0001(\b\u00122\n\u0017tower_floor_record_list\u0018\b \u0003(\u000b2\u0011.TowerFloorRecordB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerFloorRecordChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerFloorRecordOuterClass.getDescriptor() });
        internal_static_TowerFloorRecordChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor, new String[] { "IsFinishedEntranceFloor", "TowerFloorRecordList" });
        TowerFloorRecordOuterClass.getDescriptor();
    }
    
    public static final class TowerFloorRecordChangeNotify extends GeneratedMessageV3 implements TowerFloorRecordChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER = 11;
        private boolean isFinishedEntranceFloor_;
        public static final int TOWER_FLOOR_RECORD_LIST_FIELD_NUMBER = 8;
        private List<TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
        private byte memoizedIsInitialized;
        private static final TowerFloorRecordChangeNotify DEFAULT_INSTANCE;
        private static final Parser<TowerFloorRecordChangeNotify> PARSER;
        
        private TowerFloorRecordChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerFloorRecordChangeNotify() {
            this.memoizedIsInitialized = -1;
            this.towerFloorRecordList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerFloorRecordChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerFloorRecordChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.towerFloorRecordList_ = new ArrayList<TowerFloorRecordOuterClass.TowerFloorRecord>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.towerFloorRecordList_.add(input.readMessage(TowerFloorRecordOuterClass.TowerFloorRecord.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.isFinishedEntranceFloor_ = input.readBool();
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
                    this.towerFloorRecordList_ = Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerFloorRecordChangeNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsFinishedEntranceFloor() {
            return this.isFinishedEntranceFloor_;
        }
        
        @Override
        public List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
            return this.towerFloorRecordList_;
        }
        
        @Override
        public List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList() {
            return this.towerFloorRecordList_;
        }
        
        @Override
        public int getTowerFloorRecordListCount() {
            return this.towerFloorRecordList_.size();
        }
        
        @Override
        public TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int index) {
            return this.towerFloorRecordList_.get(index);
        }
        
        @Override
        public TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int index) {
            return this.towerFloorRecordList_.get(index);
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
            for (int i = 0; i < this.towerFloorRecordList_.size(); ++i) {
                output.writeMessage(8, this.towerFloorRecordList_.get(i));
            }
            if (this.isFinishedEntranceFloor_) {
                output.writeBool(11, this.isFinishedEntranceFloor_);
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
            for (int i = 0; i < this.towerFloorRecordList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.towerFloorRecordList_.get(i));
            }
            if (this.isFinishedEntranceFloor_) {
                size += CodedOutputStream.computeBoolSize(11, this.isFinishedEntranceFloor_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerFloorRecordChangeNotify)) {
                return super.equals(obj);
            }
            final TowerFloorRecordChangeNotify other = (TowerFloorRecordChangeNotify)obj;
            return this.getIsFinishedEntranceFloor() == other.getIsFinishedEntranceFloor() && this.getTowerFloorRecordListList().equals(other.getTowerFloorRecordListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFinishedEntranceFloor());
            if (this.getTowerFloorRecordListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getTowerFloorRecordListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerFloorRecordChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecordChangeNotify.PARSER, input);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerFloorRecordChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerFloorRecordChangeNotify.PARSER, input);
        }
        
        public static TowerFloorRecordChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerFloorRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecordChangeNotify.PARSER, input);
        }
        
        public static TowerFloorRecordChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerFloorRecordChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerFloorRecordChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerFloorRecordChangeNotify prototype) {
            return TowerFloorRecordChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerFloorRecordChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerFloorRecordChangeNotify getDefaultInstance() {
            return TowerFloorRecordChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerFloorRecordChangeNotify> parser() {
            return TowerFloorRecordChangeNotify.PARSER;
        }
        
        @Override
        public Parser<TowerFloorRecordChangeNotify> getParserForType() {
            return TowerFloorRecordChangeNotify.PARSER;
        }
        
        @Override
        public TowerFloorRecordChangeNotify getDefaultInstanceForType() {
            return TowerFloorRecordChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerFloorRecordChangeNotify();
            PARSER = new AbstractParser<TowerFloorRecordChangeNotify>() {
                @Override
                public TowerFloorRecordChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerFloorRecordChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerFloorRecordChangeNotifyOrBuilder
        {
            private int bitField0_;
            private boolean isFinishedEntranceFloor_;
            private List<TowerFloorRecordOuterClass.TowerFloorRecord> towerFloorRecordList_;
            private RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> towerFloorRecordListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerFloorRecordChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.towerFloorRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.towerFloorRecordList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerFloorRecordChangeNotify.alwaysUseFieldBuilders) {
                    this.getTowerFloorRecordListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isFinishedEntranceFloor_ = false;
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.towerFloorRecordListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerFloorRecordChangeNotifyOuterClass.internal_static_TowerFloorRecordChangeNotify_descriptor;
            }
            
            @Override
            public TowerFloorRecordChangeNotify getDefaultInstanceForType() {
                return TowerFloorRecordChangeNotify.getDefaultInstance();
            }
            
            @Override
            public TowerFloorRecordChangeNotify build() {
                final TowerFloorRecordChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerFloorRecordChangeNotify buildPartial() {
                final TowerFloorRecordChangeNotify result = new TowerFloorRecordChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.isFinishedEntranceFloor_ = this.isFinishedEntranceFloor_;
                if (this.towerFloorRecordListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.towerFloorRecordList_ = Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.towerFloorRecordList_ = this.towerFloorRecordList_;
                }
                else {
                    result.towerFloorRecordList_ = this.towerFloorRecordListBuilder_.build();
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
                if (other instanceof TowerFloorRecordChangeNotify) {
                    return this.mergeFrom((TowerFloorRecordChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerFloorRecordChangeNotify other) {
                if (other == TowerFloorRecordChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsFinishedEntranceFloor()) {
                    this.setIsFinishedEntranceFloor(other.getIsFinishedEntranceFloor());
                }
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (!other.towerFloorRecordList_.isEmpty()) {
                        if (this.towerFloorRecordList_.isEmpty()) {
                            this.towerFloorRecordList_ = other.towerFloorRecordList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTowerFloorRecordListIsMutable();
                            this.towerFloorRecordList_.addAll(other.towerFloorRecordList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.towerFloorRecordList_.isEmpty()) {
                    if (this.towerFloorRecordListBuilder_.isEmpty()) {
                        this.towerFloorRecordListBuilder_.dispose();
                        this.towerFloorRecordListBuilder_ = null;
                        this.towerFloorRecordList_ = other.towerFloorRecordList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.towerFloorRecordListBuilder_ = (TowerFloorRecordChangeNotify.alwaysUseFieldBuilders ? this.getTowerFloorRecordListFieldBuilder() : null);
                    }
                    else {
                        this.towerFloorRecordListBuilder_.addAllMessages(other.towerFloorRecordList_);
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
                TowerFloorRecordChangeNotify parsedMessage = null;
                try {
                    parsedMessage = TowerFloorRecordChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerFloorRecordChangeNotify)e.getUnfinishedMessage();
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
            public boolean getIsFinishedEntranceFloor() {
                return this.isFinishedEntranceFloor_;
            }
            
            public Builder setIsFinishedEntranceFloor(final boolean value) {
                this.isFinishedEntranceFloor_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFinishedEntranceFloor() {
                this.isFinishedEntranceFloor_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureTowerFloorRecordListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.towerFloorRecordList_ = new ArrayList<TowerFloorRecordOuterClass.TowerFloorRecord>(this.towerFloorRecordList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecord>)this.towerFloorRecordList_);
                }
                return this.towerFloorRecordListBuilder_.getMessageList();
            }
            
            @Override
            public int getTowerFloorRecordListCount() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.size();
                }
                return this.towerFloorRecordListBuilder_.getCount();
            }
            
            @Override
            public TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.get(index);
                }
                return this.towerFloorRecordListBuilder_.getMessage(index);
            }
            
            public Builder setTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord value) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTowerFloorRecordList(final int index, final TowerFloorRecordOuterClass.TowerFloorRecord.Builder builderForValue) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTowerFloorRecordList(final Iterable<? extends TowerFloorRecordOuterClass.TowerFloorRecord> values) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.towerFloorRecordList_);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTowerFloorRecordList() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTowerFloorRecordList(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.ensureTowerFloorRecordListIsMutable();
                    this.towerFloorRecordList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.towerFloorRecordListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder getTowerFloorRecordListBuilder(final int index) {
                return this.getTowerFloorRecordListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int index) {
                if (this.towerFloorRecordListBuilder_ == null) {
                    return this.towerFloorRecordList_.get(index);
                }
                return this.towerFloorRecordListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList() {
                if (this.towerFloorRecordListBuilder_ != null) {
                    return this.towerFloorRecordListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>)this.towerFloorRecordList_);
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder() {
                return this.getTowerFloorRecordListFieldBuilder().addBuilder(TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
            }
            
            public TowerFloorRecordOuterClass.TowerFloorRecord.Builder addTowerFloorRecordListBuilder(final int index) {
                return this.getTowerFloorRecordListFieldBuilder().addBuilder(index, TowerFloorRecordOuterClass.TowerFloorRecord.getDefaultInstance());
            }
            
            public List<TowerFloorRecordOuterClass.TowerFloorRecord.Builder> getTowerFloorRecordListBuilderList() {
                return this.getTowerFloorRecordListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListFieldBuilder() {
                if (this.towerFloorRecordListBuilder_ == null) {
                    this.towerFloorRecordListBuilder_ = new RepeatedFieldBuilderV3<TowerFloorRecordOuterClass.TowerFloorRecord, TowerFloorRecordOuterClass.TowerFloorRecord.Builder, TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder>(this.towerFloorRecordList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.towerFloorRecordList_ = null;
                }
                return this.towerFloorRecordListBuilder_;
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
    
    public interface TowerFloorRecordChangeNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsFinishedEntranceFloor();
        
        List<TowerFloorRecordOuterClass.TowerFloorRecord> getTowerFloorRecordListList();
        
        TowerFloorRecordOuterClass.TowerFloorRecord getTowerFloorRecordList(final int p0);
        
        int getTowerFloorRecordListCount();
        
        List<? extends TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder> getTowerFloorRecordListOrBuilderList();
        
        TowerFloorRecordOuterClass.TowerFloorRecordOrBuilder getTowerFloorRecordListOrBuilder(final int p0);
    }
}
